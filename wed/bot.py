import requests
from webscraping import  precioaActual 
from webscraping import  precioDeseado 

def telegram_bot_sendtext(bot_message):

    bot_token  = '6041102933:AAHqdz1PGcCqy5rlEZnGtl4du2BkP8gQXjY'

    bot_chatID = '1148376997'

    enviar_text = 'https://api.telegram.org/bot' + bot_token + '/sendMessage?chat_id=' + bot_chatID + '&parse_mode=Markdown&text=' + bot_message

    response = requests.get(enviar_text)

    return response.json()


if precioaActual <= precioDeseado:
    test = telegram_bot_sendtext(f" ¡ATENCION! Hay oferta, bajo el precio! Esta en:  {'cop'+str(precioaActual)}")
    test = telegram_bot_sendtext("https://onx.la/5805d")
else:
    test = telegram_bot_sendtext(f" ¡El precio sigue muy alto! Esta en:  {'cop'+str(precioaActual)}")


