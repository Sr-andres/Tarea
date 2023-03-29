from bs4 import BeautifulSoup
import requests

def telegram_bot_sendtext(bot_message):
    bot_token  = '6041102933:AAHqdz1PGcCqy5rlEZnGtl4du2BkP8gQXjY'
    bot_chatID = '1148376997'
    enviar_text = 'https://api.telegram.org/bot' + bot_token + '/sendMessage?chat_id=' + bot_chatID + '&parse_mode=Markdown&text=' + bot_message
    print("Send requwr")
    response = requests.get(enviar_text)
    return response.json()


url = requests.get("https://listado.mercadolibre.com.co/sdd-480gb#D")
soup = BeautifulSoup(url.content, "html.parser")
PRICE_RANGE = float(input("Price -> "))
VALUES_LIST = []
resultado = soup.find_all('li', {'class':'shops__layout-item'})
for item in resultado:
    IS_FREE_SHIPPING = item.find("p", {'class':'ui-search-item__shipping ui-search-item__shipping--free shops__item-shipping-free'})
    IS_FREE_SHIPPING = IS_FREE_SHIPPING.text if IS_FREE_SHIPPING else None
    if IS_FREE_SHIPPING:
        TITLE = item.find("h2", {'class':'ui-search-item__title shops__item-title'}).text
        PRICE = item.find("span", {'class':'price-tag-fraction'})
        PRICE = float(PRICE.text.replace(".", "")) \
            if PRICE else None
        REF = item.find("a", {'class':'ui-search-item__group__element shops__items-group-details ui-search-link'})["href"]

        if PRICE <= PRICE_RANGE:
            print(REF)
            print(TITLE)
            print(PRICE)
            print()
            #telegram_bot_sendtext(f"{TITLE} esta en descuento {REF}")