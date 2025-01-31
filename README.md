# kata
test technique kata


Pour lancer le projet :
    - Cloner le projet sur votre machine
    - Ouvrir le projet dans votre IDE
    - Executer la commande "mvn clean install"
    - run le projet


1. function de dépot d'argent
    Dans postman saisir l'url local de lacement du projet suivi du endpoint : 
    "/bankService/deposit", avec le port 8080; "http://localhost:8080/bankService/deposit"
    Dans le BodyRequest, entrer la valeur numérique corespondant au montant de dépot,
    valider
2. function de retrait d'argent
   Dans postman saisir l'url local de lacement du projet suivi du endpoint :
   "/bankService/debit", avec le port 8080; "http://localhost:8080/bankService/debit"
   Dans le BodyRequest, entrer la valeur numérique corespondant au montant de retrait,
   valider
3. function pour consulter le solde actuel
   Dans postman saisir l'url local de lacement du projet suivi du endpoint :
   "/bankService/solde", avec le port 8080; "http://localhost:8080/bankService/solde"
   valider
4. function pour consulter les transactions précédentes
   Dans postman saisir l'url local de lacement du projet suivi du endpoint :
   "/bankService/previous/{index}",'index' etant le nombre de transaction a afficher avec le port 8080;
   "http://localhost:8080/bankService/previous/3"
   valider