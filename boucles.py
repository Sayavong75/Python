prenoms_promo = ["Andrea", "Carole", "Nicolas", "Franck L", "Franck T", "Vincent", "Jean-Marc", "Nicolas", "Guillaume",
"Philippe", "Yves", "Benoît", "Pierre", "Sylvain", "Frédéric"]

# Parcourir la liste précédente. Pour chaque prénom, afficher la longueur du prénom avec la fonction len.
# for prenom in prenoms_promo :
#     print(len(prenom))

# Ajouter une variable maximum au début du programme qui vaut 0 au début.
# Pour chaque prénom, si la longueur du prénom est supérieur au maximum, remplacer maximum par cette valeur.
maxprenom = 0
for prenom in prenoms_promo :
    if len(prenom) > maxprenom :
        maxprenom = len(prenom)
        prenomlong = prenom

# Afficher le prénom le plus long à la fin avec un message : "le prénom le plus long est <prénom>, il possède <nb_lettres> lettres"
# for prenom in prenoms_promo :
#     print(maxprenom)
#     if len(prenom) = maxprenom :
#         print("ok")
    # if len(prenom) = maxi :
print("le prénom le plus long est "+prenomlong+", il possède "+str(maxprenom))
