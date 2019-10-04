prenom = "Sayavong"
nom = "SOUANDARAVONG"
age = "46 ans"
taille = "1,68 cm"
motivation = "J'aime exploiter les outils informatiques et graphiques. C'est tout moi..."

# print(motivation)

mystery1 = 8 - 6
# print(mystery1)

zebrasInZoo = 8
giraffesInZoo = 4
animalsInZoo = zebrasInZoo + giraffesInZoo
# print(animalsInZoo)

prixInitial = 1500
tva = 0.20
prixFinal = prixInitial + (prixInitial * tva)
# print(prixFinal)


nbOeufsParBoite = 6
nbOeufsTotal = 145

nbBoites = nbOeufsTotal // nbOeufsParBoite
nbOeufsRestant = nbOeufsTotal % nbOeufsParBoite
# print(nbBoites)
# print(nbOeufsRestant)

numeroCarteMystere = 28
numeroCouleur = numeroCarteMystere // 8
# numeroFigure = 
# print(numeroCouleur)

prixInitial = 1500
tva = 0.20

budget = 2000

budgetSuffisant = budget >= prixInitial + (prixInitial * tva)
# print(budgetSuffisant)

songsA = 9
songsB = 9
albumLengthA = 41
albumLengthB = 53
sameSongs = songsA == songsB
sameAlbumLength = albumLengthA == albumLengthB

# print(sameSongs)
# print(sameAlbumLength)

formateur = 'Jules'
langage = 'java'
version = 1.8
description = "Mon formateur "+formateur+" est fan de "+langage+", surtout depuis la version "+str(version)+" !!"
# print(description)

periode = "a definir"
heure = -1

if heure < 0 or heure > 24 :
    print("erreur de saisie")
elif heure < 10 :
    periode = "matinée"
    # print("bonne "+periode)
elif heure < 18 :
    periode = "après-midi"
    # print("bonne "+periode)
else :
    periode = "soirée"
    # print("bonne "+periode)
 
print("bonne "+periode)

# Créer une condition if qui affecte la valeur "matinée" à la variable periode si l'heure est inférieure à 10. Afficher ensuite un message du type : "bonne "
# Ajouter un deuxième if qui affecte la valeur "après-midi" à la variable periode si l'heure est inférieure à 18. Tester avec heure = 10, cela devrait afficher "bonne après-midi" ...
# Corriger en remplaçant le if précédent par elif. Tester avec heure = 10 et heure = 15.
# Ajouter un elif si l'heure est inférieure à 0. Dans ce cas afficher "erreur de saisie" (remarque il aurait mieux valu arrêter le programme ...)
# Ajouter un elif si l'heure est supérieure à 24. Dans ce cas afficher "erreur de saisie" (remarque il aurait mieux valu arrêter le programme ...)
# Grouper les deux cas précédent en utilisant un or.
# Dans tous les autres cas, affecter la valeur "soirée" à la variable periode. Tester avec heure = 8, heure = -5, heure = 12, heure = 18, heure = 23, heure = 35.
