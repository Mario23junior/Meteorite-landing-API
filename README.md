<p align="center"><img src="img/logo-api.gif" width = "723px" height="333px"></p>

<h1 align="center">Registro de meteoritos </h1>

<h5 align="center">
Este conjunto de dados abrangente da The Meteoritical Society contém informações sobre todos os desembarques de meteoritos conhecidos. A Fusion Table é coletada por Javier de la Torre e também fornecemos um arquivo XLS que consiste em 34.513 meteoritos<a href="https://data.nasa.gov/Space-Science/Meteorite-Landings/gh4g-9sfh" target="_blank"> NASA </a>
 e <a href="https://data.nasa.gov/data_visualizations.html" target="_blank">NASA's Open Data Portal </a>Os cientistas estimam que 44 toneladas (44.000 kg, cerca de 48,5 toneladas) de material meteorítico caem na Terra a cada dia. Vários meteoros por hora geralmente podem ser vistos em qualquer noite. Às vezes, o número aumenta drasticamente - esses eventos são chamados de chuvas de meteoros. Alguns ocorrem anualmente ou em intervalos regulares à medida que a Terra passa pelo rastro de detritos empoeirados deixados por um cometa. As chuvas de meteoros geralmente recebem o nome de uma estrela ou constelação que está perto de onde os meteoros aparecem no céu. Talvez as mais famosas sejam as Perseidas, que atingem o pico por volta de 12 de agosto de cada ano. Cada meteoro Perseida é um pequeno pedaço do cometa Swift-Tuttle, que passa pelo Sol a cada 135 anos. Outras chuvas de meteoros e seus cometas associados são os Leonids (Tempel-Tuttle), os Aquarids e Orionids (Halley) e os Taurids (Encke). A maior parte da poeira de cometas em chuvas de meteoros queima na atmosfera antes de atingir o solo; alguma poeira é capturada por aeronaves de alta altitude e analisada nos laboratórios da NASA.
<p align="center">
 
<a href="[![Meteorito API Build]](https://github.com/Mario23junior/Meteorite-landing-API/actions/workflows/maven.yml)" target="_blank"><img src="https://github.com/Mario23junior/Meteorite-landing-API/actions/workflows/maven.yml/badge.svg?branch=main"> <a href="https://en.wikipedia.org/wiki/Representational_state_transfer"><img src="https://img.shields.io/badge/interface-REST-brightgreen.svg?longCache=true&style=flat-square" target="_blank"></a>


## Etapas para testar ou reproduzir

## Primeiro execute o maven 
 
```
 mvn package
```
## Em seguida faça
```
java -jar target/meteorito-1.0-SNAPSHOT.jar

```

## Uso

```
http://localhost:8080/api/v1/meteorite/
```

## Resultado dos dados da API

```json
 [
    {
        "id": 1,
        "name": "Aachen",
        "nametype": "Valid",
        "recclass": "L5",
        "massG": "21",
        "fall": "Fell",
        "year": 1880,
        "reclat": 50.775,
        "reclong": 6.08333,
        "geoLocation": "(50.775, 6.08333)"
    },
    {
        "id": 2,
        "name": "Aarhus",
        "nametype": "Valid",
        "recclass": "H6",
        "massG": "720",
        "fall": "Fell",
        "year": 1951,
        "reclat": 56.18333,
        "reclong": 10.23333,
        "geoLocation": "(56.18333, 10.23333)"
    },
    {
        "id": 6,
        "name": "Abee",
        "nametype": "Valid",
        "recclass": "EH4",
        "massG": "107000",
        "fall": "Fell",
        "year": 1952,
        "reclat": 54.21667,
        "reclong": -113.0,
        "geoLocation": "(54.21667, -113.0)"
    },
    {
        "id": 10,
        "name": "Acapulco",
        "nametype": "Valid",
        "recclass": "Acapulcoite",
        "massG": "1914",
        "fall": "Fell",
        "year": 1976,
        "reclat": 16.88333,
        "reclong": -99.9,
        "geoLocation": "(16.88333, -99.9)"
    },
    {
        "id": 370,
        "name": "Achiras",
        "nametype": "Valid",
        "recclass": "L6",
        "massG": "780",
        "fall": "Fell",
        "year": 1902,
        "reclat": -33.16667,
        "reclong": -64.95,
        "geoLocation": "(-33.16667, -64.95)"
    },
    {
        "id": 379,
        "name": "Adhi Kot",
        "nametype": "Valid",
        "recclass": "EH4",
        "massG": "4239",
        "fall": "Fell",
        "year": 1919,
        "reclat": 32.1,
        "reclong": 71.8,
        "geoLocation": "(32.1, 71.8)"
    },
    {
        "id": 390,
        "name": "Adzhi-Bogdo (stone)",
        "nametype": "Valid",
        "recclass": "LL3-6",
        "massG": "910",
        "fall": "Fell",
        "year": 1949,
        "reclat": 44.83333,
        "reclong": 95.16667,
        "geoLocation": "(44.83333, 95.16667)"
    },
    {
        "id": 392,
        "name": "Agen",
        "nametype": "Valid",
        "recclass": "H5",
        "massG": "30000",
        "fall": "Fell",
        "year": 1814,
        "reclat": 44.21667,
        "reclong": 0.61667,
        "geoLocation": "(44.21667, 0.61667)"
    },
    {
        "id": 398,
        "name": "Aguada",
        "nametype": "Valid",
        "recclass": "L6",
        "massG": "1620",
        "fall": "Fell",
        "year": 1930,
        "reclat": -31.6,
        "reclong": -65.23333,
        "geoLocation": "(-31.6, -65.23333)"
    },
    {
        "id": 417,
        "name": "Aguila Blanca",
        "nametype": "Valid",
        "recclass": "L",
        "massG": "1440",
        "fall": "Fell",
        "year": 1920,
        "reclat": -30.86667,
        "reclong": -64.55,
        "geoLocation": "(-30.86667, -64.55)"
    },
    {
        "id": 423,
        "name": "Aioun el Atrouss",
        "nametype": "Valid",
        "recclass": "Diogenite-pm",
        "massG": "1000",
        "fall": "Fell",
        "year": 1974,
        "reclat": 16.39806,
        "reclong": -9.57028,
        "geoLocation": "(16.39806, -9.57028)"
    },
    {
        "id": 424,
        "name": "Aïr",
        "nametype": "Valid",
        "recclass": "L6",
        "massG": "24000",
        "fall": "Fell",
        "year": 1925,
        "reclat": 19.08333,
        "reclong": 8.38333,
        "geoLocation": "(19.08333, 8.38333)"
    },
    {
        "id": 425,
        "name": "Aire-sur-la-Lys",
        "nametype": "Valid",
        "recclass": "Unknown",
        "massG": "",
        "fall": "Fell",
        "year": 1769,
        "reclat": 50.66667,
        "reclong": 2.33333,
        "geoLocation": "(50.66667, 2.33333)"
    },
    {
        "id": 426,
        "name": "Akaba",
        "nametype": "Valid",
        "recclass": "L6",
        "massG": "779",
        "fall": "Fell",
        "year": 1949,
        "reclat": 29.51667,
        "reclong": 35.05,
        "geoLocation": "(29.51667, 35.05)"
    },
    {
        "id": 427,
        "name": "Akbarpur",
        "nametype": "Valid",
        "recclass": "H4",
        "massG": "1800",
        "fall": "Fell",
        "year": 1838,
        "reclat": 29.71667,
        "reclong": 77.95,
        "geoLocation": "(29.71667, 77.95)"
    },
    {
        "id": 432,
        "name": "Akwanga",
        "nametype": "Valid",
        "recclass": "H",
        "massG": "3000",
        "fall": "Fell",
        "year": 1959,
        "reclat": 8.91667,
        "reclong": 8.43333,
        "geoLocation": "(8.91667, 8.43333)"
    },
    {
        "id": 433,
        "name": "Akyumak",
        "nametype": "Valid",
        "recclass": "Iron, IVA",
        "massG": "50000",
        "fall": "Fell",
        "year": 1981,
        "reclat": 39.91667,
        "reclong": 42.81667,
        "geoLocation": "(39.91667, 42.81667)"
    },
    {
        "id": 446,
        "name": "Al Rais",
        "nametype": "Valid",
        "recclass": "CR2-an",
        "massG": "160",
        "fall": "Fell",
        "year": 1957,
        "reclat": 24.41667,
        "reclong": 39.51667,
        "geoLocation": "(24.41667, 39.51667)"
    },
    {
        "id": 447,
        "name": "Al Zarnkh",
        "nametype": "Valid",
        "recclass": "LL5",
        "massG": "700",
        "fall": "Fell",
        "year": 2001,
        "reclat": 13.66033,
        "reclong": 28.96,
        "geoLocation": "(13.66033, 28.96)"
    },
    {
        "id": 448,
        "name": "Alais",
        "nametype": "Valid",
        "recclass": "CI1",
        "massG": "6000",
        "fall": "Fell",
        "year": 1806,
        "reclat": 44.11667,
        "reclong": 4.08333,
        "geoLocation": "(44.11667, 4.08333)"
    },
    {
        "id": 453,
        "name": "Albareto",
        "nametype": "Valid",
        "recclass": "L/LL4",
        "massG": "2000",
        "fall": "Fell",
        "year": 1766,
        "reclat": 44.65,
        "reclong": 11.01667,
        "geoLocation": "(44.65, 11.01667)"
    },
    {
        "id": 454,
        "name": "Alberta",
        "nametype": "Valid",
        "recclass": "L",
        "massG": "625",
        "fall": "Fell",
        "year": 1949,
        "reclat": 2.0,
        "reclong": 22.66667,
        "geoLocation": "(2.0, 22.66667)"
    },
    {
        "id": 458,
        "name": "Alby sur Chéran",
        "nametype": "Valid",
        "recclass": "Eucrite-mmict",
        "massG": "252",
        "fall": "Fell",
        "year": 2002,
        "reclat": 45.82133,
        "reclong": 6.01533,
        "geoLocation": "(45.82133, 6.01533)"
    },
    {
        "id": 461,
        "name": "Aldsworth",
        "nametype": "Valid",
        "recclass": "LL5",
        "massG": "700",
        "fall": "Fell",
        "year": 1835,
        "reclat": 51.78333,
        "reclong": -1.78333,
        "geoLocation": "(51.78333, -1.78333)"
    },
    {
        "id": 462,
        "name": "Aleppo",
        "nametype": "Valid",
        "recclass": "L6",
        "massG": "3200",
        "fall": "Fell",
        "year": 1873,
        "reclat": 36.23333,
        "reclong": 37.13333,
        "geoLocation": "(36.23333, 37.13333)"
    },
    {
        "id": 463,
        "name": "Alessandria",
        "nametype": "Valid",
        "recclass": "H5",
        "massG": "908",
        "fall": "Fell",
        "year": 1860,
        "reclat": 44.88333,
        "reclong": 8.75,
        "geoLocation": "(44.88333, 8.75)"
    },
    {
        "id": 465,
        "name": "Alexandrovsky",
        "nametype": "Valid",
        "recclass": "H4",
        "massG": "9251",
        "fall": "Fell",
        "year": 1900,
        "reclat": 50.95,
        "reclong": 31.81667,
        "geoLocation": "(50.95, 31.81667)"
    },
    {
        "id": 466,
        "name": "Alfianello",
        "nametype": "Valid",
        "recclass": "L6",
        "massG": "228000",
        "fall": "Fell",
        "year": 1883,
        "reclat": 45.26667,
        "reclong": 10.15,
        "geoLocation": "(45.26667, 10.15)"
    },
    {
        "id": 2276,
        "name": "Allegan",
        "nametype": "Valid",
        "recclass": "H5",
        "massG": "32000",
        "fall": "Fell",
        "year": 1899,
        "reclat": 42.53333,
        "reclong": -85.88333,
        "geoLocation": "(42.53333, -85.88333)"
    },
    {
        "id": 2278,
        "name": "Allende",
        "nametype": "Valid",
        "recclass": "CV3",
        "massG": "2000000",
        "fall": "Fell",
        "year": 1969,
        "reclat": 26.96667,
        "reclong": -105.31667,
        "geoLocation": "(26.96667, -105.31667)"
    },
]

```
