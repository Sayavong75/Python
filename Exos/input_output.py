# -- Créer un programme qui demande à l'utilisateur de se présenter : prénom, nom et age.
# -- Utilisez la console pour afficher un message d'accueil personnalisé du type "Bonjour Jules Grand tu as 30 ans c'est bien ça ?"

# def dire_bonjour(prenom,nom,age):
#     return "Bonjour " + prenom + " " + nom + ". Tu as " + str(age) + " ans, c'est bien ça ?"

# prenom_utilisateur = input("Bonjour, quel est ton prénom ? ")
# nom_utilisateur = input("Bonjour, quel est ton nom ? ")
# age_utilisateur = input("Bonjour, quel âge as-tu ? ")

# print(dire_bonjour(prenom_utilisateur,nom_utilisateur,age_utilisateur))

# -- Créer un programme qui fera la même chose tout en écrivant les informations reçues dans un fichier texte.
# -- Le fichier devra être nommé prenom-nom.txt
# f = open('./prenom-nom.txt', 'w')
# f.write(dire_bonjour(prenom_utilisateur,nom_utilisateur,age_utilisateur))
# f.close()

# -- Créer un programme qui va lire le fichier films-2018.txt et indiquer combien il y a de films sortis en 2018.

# nb = 0
# # f = open('./films-2018.txt', 'r')
# f = open('/home/bnp-renault-012/Python/films-2018.txt', 'r')
# for line in f:
#     nb = nb + 1
# f.close()
# print("le nombre de lignes est de "+str(nb))
# films = f.readlines() # 2ème solution lirentreze toutes les lignes
# len(films)


# -- Créer un programme qui va lire le fichier villes-france.txt et indiquer combien de fois apparaît TOULOUSE dans le fichier.
nb = 0
ville = "TOULOUSE"
f = open('./villes-france.txt', 'r')
for line in f:
    if ville in line:
        nb = nb + 1
        # print(line)entrez

f.close()
print(nb)

# Créer un programme qui va lire le fichier villes-france.txt
# et créer un nouveau fichier sans doublons (après modification,
# le nouveau fichier ne doit contenir qu'une seule fois le même nom de ville).
# f = open('./villes-france.txt', 'r')
# f = open('./villes-sansdoublons', 'x')
# print(f.readline())
# f.close()


# Créer un programme qui va lire le fichier villes-france.txt
# et créer un nouveau fichier dans lequel chaque ligne donnera le nom d'une ville
# en affichant le nombre d’occurrence dans le fichier de départ.
# Ce fichier devra être trié par ordre alphabétique.

villes = []
villes = {} # Dictionnaire avec association clé-valeur {clé : valeur}