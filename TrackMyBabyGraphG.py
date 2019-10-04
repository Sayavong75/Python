# On importe les modules qui vont nous permettre de traiter les données

# matplotlib pour réaliser les graphiques
import matplotlib.pyplot as plt


# csv pour lire les fichiers de données
import csv
from pylab import *

# ----------------------------------------------------------------------------------------------------
# Graphique poids garcon
# Init des variables tableaux
x = []
x1 = []
y = []
y1 = []
y2 = []
y3 = []
y4 = []
y5 = []

# Import du csv : constances poids garcon
with open('poids-age-garcon-0-60-light.csv', 'r') as csvfile:
    plots= csv.reader(csvfile, delimiter=';')
    for row in plots:
        if (row[0]) != "Month":
            x1.append(int(row[0]))
            y1.append(float(row[1]))
            y2.append(float(row[2]))
            y3.append(float(row[3]))
            y4.append(float(row[4]))
            y5.append(float(row[5]))

# Import du csv : mesures nourrisson
with open('mesures.csv', 'r') as csvfile:
    plots= csv.reader(csvfile, delimiter=';')
    for row in plots:
        if (row[0]) != "Mois":
            x.append(int(row[0]))
            y.append(float(row[1]))

# Chargement du graphique
# subplot(nblignes, nbcolonnes, index, **kwargs)
subplot(131)
plt.scatter(x,y, color = 'black')
plt.plot(x1,y1, label = '5% poids')
plt.plot(x1,y2, label = '25% poids')
plt.plot(x1,y3, label = '50% poids')
plt.plot(x1,y4, label = '75% poids')
plt.plot(x1,y5, label = '95% poids')

plt.ylim([2,24])
plt.xlabel('Age en mois')
plt.ylabel('Poids en kg')
plt.title('Graphique mesures poids nourrisson')
plt.legend()
plt.grid()

# ----------------------------------------------------------------------------------------------------
# Graphique taille garcon
x = []
x1 = []
y = []
y1 = []
y2 = []
y3 = []
y4 = []
y5 = []

with open('taille-age-garcon-0-60-light.csv', 'r') as csvfile:
    plots= csv.reader(csvfile, delimiter=';')
    for row in plots:
        if (row[0]) != "Month":
            x1.append(int(row[0]))
            y1.append(float(row[1]))
            y2.append(float(row[2]))
            y3.append(float(row[3]))
            y4.append(float(row[4]))
            y5.append(float(row[5]))

with open('mesures.csv', 'r') as csvfile:
    plots= csv.reader(csvfile, delimiter=';')
    for row in plots:
        if (row[0]) != "Mois":
            x.append(int(row[0]))
            y.append(float(row[2]))

subplot(132)
plt.scatter(x,y, color = 'black')
plt.plot(x1,y1, label = '5% taille')
plt.plot(x1,y2, label = '25% taille')
plt.plot(x1,y3, label = '50% taille')
plt.plot(x1,y4, label = '75% taille')
plt.plot(x1,y5, label = '95% taille')

plt.xlabel('Age en mois')
plt.ylabel('Taille en cm')
plt.title('Graphique mesures taille nourrisson')
plt.legend()
plt.grid()

# ----------------------------------------------------------------------------------------------------
# Graphique périmètre crâne garcon
x = []
x1 = []
y = []
y1 = []
y2 = []
y3 = []
y4 = []
y5 = []

with open('perim-cra-age-garcon-0-60-light.csv', 'r') as csvfile:
    plots= csv.reader(csvfile, delimiter=';')
    for row in plots:
        if (row[0]) != "Month":
            x1.append(int(row[0]))
            y1.append(float(row[1]))
            y2.append(float(row[2]))
            y3.append(float(row[3]))
            y4.append(float(row[4]))
            y5.append(float(row[5]))

with open('mesures.csv', 'r') as csvfile:
    plots= csv.reader(csvfile, delimiter=';')
    for row in plots:
        if (row[0]) != "Mois":
            x.append(int(row[0]))
            y.append(float(row[3]))

subplot(133)
plt.scatter(x,y, color = 'black')
plt.plot(x1,y1, label = '5% périmètre crânien')
plt.plot(x1,y2, label = '25% périmètre crânien')
plt.plot(x1,y3, label = '50% périmètre crânien')
plt.plot(x1,y4, label = '75% périmètre crânien')
plt.plot(x1,y5, label = '95% périmètre crânien')

plt.ylim([31,54])
plt.xlabel('Age en mois')
plt.ylabel('périmètre crânien en cm')
plt.title('Graphique mesures périmètre crânien nourrisson')
plt.legend(loc = 'lower right')
plt.grid()

# ----------------------------------------------------------------------------------------------------

plt.show()