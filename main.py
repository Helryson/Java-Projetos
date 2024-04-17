import random
import csv

def main():
    table = [["ANO", "MÊS", "VALORMETA", "NOMECATEGORIA", "PAÍS"]]
    categorias = ["Acessorio", "Bicicleta", "Tenis", "Barraca"]

    contadorano = 2016
    contadormes = 0
    paises = ["BR", "GE", "FR", "US", "GB"]
    contador_pais = 0
    contador_categoria = 0

    for x in range(0, 1960):
        contador_mes += 1
        pais_atual = paises[contador_pais]

        contador_pais +=1

        if contador_pais >= 4:
            contador_pais = 0

        if contador_mes > 12:
            contador_ano += 1
            contador_mes = 0

        for z in range(0, 4):
            if contador_categoria < 4:
                categoria_atual = categorias[contador_categoria]
                contador_categoria += 1
            else:
                contador_categoria = 0
            valor_meta = random.randint(50_000, 100_000)
            table.append([f"{contador_ano}", f"{contador_mes}", f"{valor_meta}", f"{categoria_atual}", f"{pais_atual}"])

        if contador_ano > 2024:
            break

    print(table)


if __name == '__main':
    main()