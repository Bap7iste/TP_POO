Web -> Bibliothèques permettant de developper une application web et notemment de gérer les requêtes HTTP

JPA/Hibernate -> Permet la gestion d'une base de donnée, CRUD sans formuler de SQL

H2 -> Base de donnée SQL pour JAVA

DevTools -> Contient des outils des outils qui permettent de developper plus rapidemment et plus efficacement

Thymeleaf -> Librairie permettant de developper une application web, permet l'utilisation d'HTML.


########################
Requetes :
INSERT INTO address (id, creation, content, autor) VALUES (1, CURRENT_TIMESTAMP(), '57 boulevard demorieux', 'Gilbert');
INSERT INTO address (id, creation, content, autor) VALUES (2, CURRENT_TIMESTAMP(), '51 allee du gamay, 34080
montpellier', 'Jeanette');
#########################


Etape 13 Qestions :

1) HelloWorldController : Ligne 10 -> @GetMapping("/greeting")
2) HelloWorldController : Ligne 14 -> return "greeting"
3) Grâce à une requête HTTP qui donne une valeur à la variable name

Etape 17 : La table address est apparue

Etape 18 :

Etape 20 : Oui avec "Select * from address;"

Etape 22 : L’annotation @Autowired permet d’activer l’injection automatique de dépendance. Le Spring Framework va chercher le bean du contexte d’application dont le type est applicable à chaque paramètre du constructeur, aux paramètres de la méthode ou à l’attribut.

Etape 30 : Ajout de la ligne : "<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">" sur la page HTML.

Git : https://github.com/Bap7iste/TP_POO.git