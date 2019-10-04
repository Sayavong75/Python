#Aire Triangle
def calcul_aire_triangle(base, hauteur):
    return (base * hauteur) / 2


# Créer une fonction qui renvoie le volume d'une sphère en prenant en paramètre son rayon.
import math
def volume(rayon):
    return 4/3 * math.pi * rayon ** 3

# Créer une fonction qui renvoie un message donnant l'IMC d'une personne. Elle prendra en paramètre le prénom de la personne, son poids en kg et sa taille en cm.
def imc(taille, poids):
    return poids / (taille / 100) ** 2

# print(calcul_aire_triangle(2,7))
print(volume(12))
print(round(imc(184.5,73),1))


print(f"imc : {round(imc(184.5,73),1)}")
