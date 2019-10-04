prenoms_promo = ["Andrea", "Carole", "Nicolas", "Franck L", "Franck T", "Vincent", "Jean-Marc", "Nicolas", "Guillaume",
"Philippe", "Yves", "Benoît", "Pierre", "Sylvain", "Frédéric"]
prenoms_promo.sort #modifie la liste en nouvelle sortie
print(sorted(prenoms_promo)) #copie de la liste sans modifier la liste originale
print(prenoms_promo)

print(len(prenoms_promo))

print(prenoms_promo[0:len(prenoms_promo):2])
print(prenoms_promo[::2]) #le : par défaut début et fin

print(prenoms_promo[1::2])
print(prenoms_promo[0:7])
print(prenoms_promo[7:])

print(len(prenoms_promo)//2)