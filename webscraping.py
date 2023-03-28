from bs4 import BeautifulSoup
import requests
import time
import webbrowser

#precioDeseado = int(input("¿Cual es su precio deseado?: "))
#print("Accediendo a la web..")
#time.sleep(2)
#print("Verificando el precio..")
#time.sleep(2)
#print("Aguarde por favor...")
#time.sleep(1)

#precioDeseado = 10

url = requests.get("https://www.mercadolibre.com.co/disco-solido-ssd-interno-kingston-sa400s37480g-480gb-negro/p/MCO17978326?pdp_filters=category:MCO1672#searchVariation=MCO17978326&position=1&search_layout=stack&type=product&tracking_id=7dc2ad80-af31-4118-a320-f47d63a080dc")
soup = BeautifulSoup(url.content, "html.parser")
resultado = soup.find('span', {'class':'andes-money-amount__fraction'})
precioaActual_text = resultado.text
precioaActual = float (precioaActual_text)


precioDeseado = 150.448

if precioaActual <= precioDeseado:
    print(f" ¡ATENCION! Hay oferta, bajo el precio! Esta en:  {'$'+str(precioaActual)} ")
    
else:
    print(f"El precio sigue demasiado alto: {'cop'+str(precioaActual)}")