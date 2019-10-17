# Projet Statistiques de Bibliothèque

Réalisation d'un mini projet en mode console de réalisation de statistiques sur des livres en programmation Java (version > 1.8).
Auteur : Sayavong SOUANDARAVONG
Date : 17 octobre 2019

## Fichiers

Les fichiers **DisplayList.java**, **StatsBiblio.java**, et le dossier **BooksSources** sont à copier dans le répertoire ``src`` du dossier ``IntelliJ``.
Le fichier ``main`` se nomme **StatsBiblio.java**.

## Utilisation

Au lancement du programme **StatsBiblio**, un ``menu principal`` proposera à l'utilisateur 5 options :

>     MENU PRINCIPAL                
> 1. Lister les fichiers
> 2. Ajouter un fichier
> 3. Supprimer un fichier
> 4. Afficher des informations sur un livre
> 5. Quitter le programme
---------------------------------------------
- La sélection d'une option s'effectue par la saisie du numéro associé à l'option ``Entrez le numéro de votre choix :``
- L'option ``4. Afficher des informations sur un livre`` affiche un sous-menu.

>     Lecture du fichier sélectionné : Spinoza-Traite_Politique.txt
> 1. Afficher le nombre de lignes du fichier
> 2. Afficher le nombre de mots du fichier
> 3. Afficher les 50 mots les plus fréquents et leur nombre d'occurrences
- La sortie du programme se fait par l'option ``5. Quitter le programme``.

## Informations pour les tests

- L'option ``1. Lister les fichiers`` du ``menu principal``et les 3 options ``1. Afficher le nombre de lignes du fichier``, ``2. Afficher le nombre de mots du fichier``, ``3. Afficher les 50 mots les plus fréquents et leur nombre d'occurrences`` du menu ``4. Afficher des informations sur un livre`` font une lecture des fichiers se trouvant dans le dossier **BooksSources**.
- Les options ``2. Ajouter un fichier`` et ``3. Supprimer un fichier`` du ``menu principal``font uniquement appel à des tables (exemple ArrayList). Les mises à jour déclenchées par ces 2 options n'impactent pas les fichiers réels du dossier **BooksSources**.
- Lors des premières lectures des fichiers pour afficher des compteurs ou des mots, prévoir un délai de 5 secondes environ pour charger les données à l'affichage de la console.

## Informations sur le code Java

A venir...
