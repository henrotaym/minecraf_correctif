# minecraf
Créer un petit jeu java
Vous incarnez un joueur qui se déplace dans un monde rempli de surprises. Au cours de vos déplacements, vous trouverez des items de deux catégories principales
    - nourriture (permet de se soigner)
    - arme (permet d'attaquer)
Vous pouvez porter au maximum 6 éléments dans votre inventaire
Si le joueur trouve un élément mais que son inventaire est plein, il doit se défausser d’un élément
Au démarrage du jeu, l'inventaire du joueur est vide et il contient 6 cases.
Le joueur pourra rencontrer des monstres. 
Les monstres ont également un inventaire et celui-ci est aléatoire. Il est composé de 2 à 12 slots (tiré aléatoirement) et chaque slot peut contenir un item ou non.
La force du joueur et des monstres est basées sur leur armes dans l'inventaire.
Le combat avec un monstre est au tour par tour et il se termine si un combattant n'a plus de PV.
Le joueur démarre la partie avec 100PV
Les monstres ont des PV aléatoires entre 15 et 50 PV (entier).
Les cases du jeu pourront contenir un item, un monstre ou rien du tout.
Le jeu a une seule dimension et le joueur se déplace de case en case.
Selon ce qu'il y a sur la case, le jeu proposera au joueur les actions adéquates.
Le nombre de cases de la map est tiré aléatoirement (entier entre 15 et 30) au démarrage du jeu
Si le joueur tombe à 0 PV, le jeu s'arrête.
S'il n'y a plus de case, le jeu s'arrête.