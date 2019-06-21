public class Order {
    /**
     * Afficher tous les menus disponibles du restaurant
     */
    public void displayAvailableMenus(){
        System.out.println("Choix du menu");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }

    /**
     * Affiche un menu sélectionné
     * @param nombreMenu
     */
    public void displaySelectedMenu(int nombreMenu){
        System.out.println("Vous avez choisi le menu " + nombreMenu);
    }
}
