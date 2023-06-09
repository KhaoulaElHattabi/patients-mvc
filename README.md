## Activité Pratique N°3 : Spring MVC avec Thymeleaf
L'objectif de cette activité est creer une application Spring pour gerer la partie web en utilisant l'architecture *Spring MVC*.
- En premier plan on a commencé par ma creation du repository PatientRepository dans la couche DAO comme l'activité precedent https://github.com/KhaoulaElHattabi/jpa-ap.git
<p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234149015-1cf16645-3a26-49ef-a086-7130c5d5340c.png"/>
</p>

- Creation de l'entité JPA Patient pour assure l'ORM en utilisant les annotations *Lombok* aussi on ajoute la dependance *Sring Validation* pour l'utilisation de @NotEmpty, @DecimalMin, @Size dans la classe Patient.java

<p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234148746-2668e6f1-cb4f-452c-a9c3-2b28a276986a.png"/>
</p>

- Pour la partie *WEB*, les vues sont générées  par le template engine *Thymeleaf* et en utilisant une classe *@Controlleur* dans laquelle on va créer un model dans lequel on va stocker les resultats des requetes 
<p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234299739-754b2269-2013-4c89-99c8-59abd7186ae3.png"/>
</p>

pour gerer les *path* et le type de requete de chaque path avec les methodes effectuées dans cette page et l'utilisation de l'annotation @@Valid apour la verifications des regles qu'on a specifié precedemment dans la classe Patient.java afin de gerer les erreurs par * bindingResult*
<p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234300233-5981eef9-af51-49cf-be80-72262dbdfdc4.png"/>
</p>

 chaque lien est associé à une action/methode qui va s'effectuer dans un template generée par Thymleaf par exemple le template *patien.html", dans l'action de la  formulaire on a specifié dans l'action l'un des mapping path qu'on a creer dans la classe @Controller 
 <p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234301911-c8528ddf-0955-4fcf-9a0c-717cc220cd00.png"/></p>
- Chaque colonne est generée par les attributs de Thymeleaf
<p><img src="https://user-images.githubusercontent.com/92638641/234302034-32f79097-e6d5-4caa-8db1-39744969e37a.png"/></p>

- Et finalement le bouton est aussi une action qui appartient à la classe Controlleur
<p align="center" ><img src="https://user-images.githubusercontent.com/92638641/234302239-4bd06536-69a5-47e6-9672-bd3a79d6d0d6.png"/></p>
- Aprés on a ajouter la dependance *layout Thymeleaf* pour ajouter une template dans l'autre, et dans notre projet on doit ajouter la template du navebar dans toute les page , commençons par la creation du template *template1.html*
<p align="center" ><img src="https://user-images.githubusercontent.com/92638641/234307322-81fb1e06-1dcf-4533-bc9c-4656b9d7244b.png"/></p>
- Ensuite  ajoute cette template dans l'autre template avec la balise *section*
 en specifiant deja le nom de cette template 
 <p align="center"><img src="https://user-images.githubusercontent.com/92638641/234317536-ee78b466-76d8-4504-bf69-32e8990ff056.png"/></p>
 
 - Aussi on a créé une template pour la formulaire pour l'edit et l'ajout du patient:
 <p align="center">
 <img src="https://user-images.githubusercontent.com/92638641/234310751-fed9e194-8369-4fff-8ad5-7dbd8bdd9ea3.png"/></p>
 
- Apres l'execution de l'application dans le browser on aura:
1- La page de la liste des patients avec les boutons *Edit*  et *Delete* en ajouter la pagination au dessous du tableau :

<p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234333827-c621b6c1-1673-4e36-8e6c-3d59e621a9cd.png"/>
 </p>
 2- La formulaire de la modification du patient:
 <p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234334768-951d9d36-adf9-495b-bb48-cba0c80a8f00.png"/>
 </p>
3- La formulaire de la modification du patient:
 <p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234336267-a0db29fb-0582-404a-a60b-71c744336e65.png"/>
 </p>
 
 4- Avant la suppression du user *Hamza* avec id *4*: 
  <p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234336687-086ed078-c167-4745-be28-2526a29654da.png"/>
 </p>
  5- Après la suppression du user *Hamza* avec id *4*: 
  
<p align="center">
<img src="https://user-images.githubusercontent.com/92638641/234336987-d9ec214a-e41d-41fb-93c9-fe7e85dda6c2.png"/>
 </p>
