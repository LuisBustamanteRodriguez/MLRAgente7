
//javac GSLRAgent.java
//java jade.Boot -gui -agents ag1:GSLRAgent

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class GSLRAgent extends Agent {

    protected void setup() {
        // Crear y mostrar la GUI
        InputDialogBox myGui = new InputDialogBox(this);
        myGui.showGui();
        System.out.println("Mi nombre es el agente " + getAID().getLocalName());

    }
    //mostrar los resultados
    public void getX(final String x) {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                GradientLinearRegression GSLR = new GradientLinearRegression();
                System.out.println("Ecuacion:\nY = "+GSLR.getB0()+" + "+GSLR.getB1()+"X");
                System.out.print("Proyeccion de Y:");
                System.out.print(GSLR.getB0()+GSLR.getB1()*Double.parseDouble(x));
            }
        });

    }
}
