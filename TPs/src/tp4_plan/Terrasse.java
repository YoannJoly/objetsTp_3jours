package tp4_plan;

import java.awt.*;


public class Terrasse extends Emplacement {
    
    public Terrasse(Color couleur, int xCentre, int yCentre) {
        super( couleur, xCentre, yCentre);
    }

    public String affiche() {
        return "Terrasse" + "Couleur=" + getCouleur() + ", xCentre=" + getxCentre() + ", yCentre=" + getyCentre();
    }

 
    
   
    
}


    

