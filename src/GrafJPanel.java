//package Grafico2D;

// Fig. 12.5: ColorJPpanel.java
// Demonstrando Colors.
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class GrafJPanel extends JPanel 
{
	private int xOrigem=20, yOrigem=460;
	private double escala = 50;

	public int getXint(double x)
	{
		return (int) (xOrigem + ( x * escala ));
	}
	
	public int getYint(double y)
	{
		return (int) (yOrigem - ( y * escala ));
	}
	
   // desenha o Gráfico
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o paintComponent da superclasse

      this.setBackground( Color.WHITE );

      // Plota os Eixos
      xOrigem = this.getWidth() / 2; 
      yOrigem = this.getHeight()/2;
      
      // xOrigem = 20;
      // yOrigem = 460;
      
      g.setColor( Color.BLACK );
      g.drawLine( 0, yOrigem, this.getWidth(), yOrigem);
      g.drawLine( xOrigem, 0, xOrigem , this.getHeight());
     
      for (double i = 0; i < ((this.getWidth()/2)/escala); i++)
    	  g.drawLine( getXint(i), getYint(0.05), getXint(i), getYint(-0.05));
      for (double i = 0; i > -((this.getWidth()/2)/escala); i--) 
          g.drawLine( getXint(i), getYint(0.05), getXint(i), getYint(-0.05));
      for (double i = 0; i < ((this.getWidth()/2)/escala); i++) 
          g.drawLine( getXint(0.05), getYint(i), getXint(-0.05), getYint(i));
      for (double i = 0; i > -((this.getWidth()/2)/escala); i--) 
          g.drawLine( getXint(0.05), getYint(i), getXint(-0.05), getYint(i));
       
      g.setColor(Color.BLUE);
      for (int i = 0; i < ((this.getWidth()/2)/escala); i++)
    	  g.drawString(""+i, getXint(i-0.1), getYint(-0.2));
      for (int i = 1; i < ((this.getWidth()/2)/escala); i++) 
          g.drawString(""+i, getXint(-0.2), getYint(i));
      for (int i = -1; i > -((this.getWidth()/2)/escala); i--)
    	  g.drawString(""+i, getXint(i-0.1), getYint(-0.2));
      for (int i = -1; i > -((this.getWidth()/2)/escala); i--) 
          g.drawString(""+i, getXint(-0.2), getYint(i));

      Vertice v1 = new Vertice(-4, -1);
      Vertice v2 = new Vertice(-6, -2);
      Vertice v3 = new Vertice(-5, -2);
      Vertice v4 = new Vertice(-5, -4);
      Vertice v5 = new Vertice(-3, -4);
      Vertice v6 = new Vertice(-3, -2);
      Vertice v7 = new Vertice(-2, -2);
      Vertice v8 = new Vertice(-2, -1);

      g.setColor(Color.GREEN);
      g.drawLine(getXint(v1.x), getYint(v1.y), getXint(v2.x), getYint(v2.y));
      g.drawLine(getXint(v2.x), getYint(v2.y), getXint(v3.x), getYint(v3.y));
      g.drawLine(getXint(v3.x), getYint(v3.y), getXint(v4.x), getYint(v4.y));
      g.drawLine(getXint(v4.x), getYint(v4.y), getXint(v5.x), getYint(v5.y));
      g.drawLine(getXint(v5.x), getYint(v5.y), getXint(v6.x), getYint(v6.y));
      g.drawLine(getXint(v6.x), getYint(v6.y), getXint(v7.x), getYint(v7.y));
      g.drawLine(getXint(v7.x), getYint(v7.y), getXint(v8.x), getYint(v8.y));
      g.drawLine(getXint(v8.x), getYint(v8.y), getXint(v1.x), getYint(v1.y));

      Vertice [] vertices = {v1, v2, v3, v4, v5, v6, v7, v8};
      Vertice [] verticesRotacionados = new Vertice[8];
      Vertice [] verticesERotacionados = new Vertice[8];
      Vertice [] verticesRTranslacionados = new Vertice[8];
      Vertice [] verticesERTranslacionados = new Vertice[8];
      Vertice [] verticesRTEscala = new Vertice[8];
      Vertice [] verticesEscala = new Vertice[8];

       for (int i = 0; i < vertices.length; i++) {
           verticesRotacionados [i] = Ex_Trasf2D.rotacao(vertices[i], 60);
       }

       g.setColor(Color.RED);
       g.drawLine(getXint(verticesRotacionados[0].x), getYint(verticesRotacionados[0].y), getXint(verticesRotacionados[1].x), getYint(verticesRotacionados[1].y));
       g.drawLine(getXint(verticesRotacionados[1].x), getYint(verticesRotacionados[1].y), getXint(verticesRotacionados[2].x), getYint(verticesRotacionados[2].y));
       g.drawLine(getXint(verticesRotacionados[2].x), getYint(verticesRotacionados[2].y), getXint(verticesRotacionados[3].x), getYint(verticesRotacionados[3].y));
       g.drawLine(getXint(verticesRotacionados[3].x), getYint(verticesRotacionados[3].y), getXint(verticesRotacionados[4].x), getYint(verticesRotacionados[4].y));
       g.drawLine(getXint(verticesRotacionados[4].x), getYint(verticesRotacionados[4].y), getXint(verticesRotacionados[5].x), getYint(verticesRotacionados[5].y));
       g.drawLine(getXint(verticesRotacionados[5].x), getYint(verticesRotacionados[5].y), getXint(verticesRotacionados[6].x), getYint(verticesRotacionados[6].y));
       g.drawLine(getXint(verticesRotacionados[6].x), getYint(verticesRotacionados[6].y), getXint(verticesRotacionados[7].x), getYint(verticesRotacionados[7].y));
       g.drawLine(getXint(verticesRotacionados[7].x), getYint(verticesRotacionados[7].y), getXint(verticesRotacionados[0].x), getYint(verticesRotacionados[0].y));


       for (int i = 0; i < verticesRotacionados.length; i++) {
           verticesRTranslacionados [i] = Ex_Trasf2D.translacao(verticesRotacionados[i], 3, 2);
       }

       g.setColor(Color.ORANGE);
       g.drawLine(getXint(verticesRTranslacionados[0].x), getYint(verticesRTranslacionados[0].y), getXint(verticesRTranslacionados[1].x), getYint(verticesRTranslacionados[1].y));
       g.drawLine(getXint(verticesRTranslacionados[1].x), getYint(verticesRTranslacionados[1].y), getXint(verticesRTranslacionados[2].x), getYint(verticesRTranslacionados[2].y));
       g.drawLine(getXint(verticesRTranslacionados[2].x), getYint(verticesRTranslacionados[2].y), getXint(verticesRTranslacionados[3].x), getYint(verticesRTranslacionados[3].y));
       g.drawLine(getXint(verticesRTranslacionados[3].x), getYint(verticesRTranslacionados[3].y), getXint(verticesRTranslacionados[4].x), getYint(verticesRTranslacionados[4].y));
       g.drawLine(getXint(verticesRTranslacionados[4].x), getYint(verticesRTranslacionados[4].y), getXint(verticesRTranslacionados[5].x), getYint(verticesRTranslacionados[5].y));
       g.drawLine(getXint(verticesRTranslacionados[5].x), getYint(verticesRTranslacionados[5].y), getXint(verticesRTranslacionados[6].x), getYint(verticesRTranslacionados[6].y));
       g.drawLine(getXint(verticesRTranslacionados[6].x), getYint(verticesRTranslacionados[6].y), getXint(verticesRTranslacionados[7].x), getYint(verticesRTranslacionados[7].y));
       g.drawLine(getXint(verticesRTranslacionados[7].x), getYint(verticesRTranslacionados[7].y), getXint(verticesRTranslacionados[0].x), getYint(verticesRTranslacionados[0].y));


       for (int i = 0; i < verticesRTranslacionados.length; i++) {
           verticesRTEscala [i] = Ex_Trasf2D.escala(verticesRTranslacionados[i], 2, 2);
       }

       g.setColor(Color.MAGENTA);
       g.drawLine(getXint(verticesRTEscala[0].x), getYint(verticesRTEscala[0].y), getXint(verticesRTEscala[1].x), getYint(verticesRTEscala[1].y));
       g.drawLine(getXint(verticesRTEscala[1].x), getYint(verticesRTEscala[1].y), getXint(verticesRTEscala[2].x), getYint(verticesRTEscala[2].y));
       g.drawLine(getXint(verticesRTEscala[2].x), getYint(verticesRTEscala[2].y), getXint(verticesRTEscala[3].x), getYint(verticesRTEscala[3].y));
       g.drawLine(getXint(verticesRTEscala[3].x), getYint(verticesRTEscala[3].y), getXint(verticesRTEscala[4].x), getYint(verticesRTEscala[4].y));
       g.drawLine(getXint(verticesRTEscala[4].x), getYint(verticesRTEscala[4].y), getXint(verticesRTEscala[5].x), getYint(verticesRTEscala[5].y));
       g.drawLine(getXint(verticesRTEscala[5].x), getYint(verticesRTEscala[5].y), getXint(verticesRTEscala[6].x), getYint(verticesRTEscala[6].y));
       g.drawLine(getXint(verticesRTEscala[6].x), getYint(verticesRTEscala[6].y), getXint(verticesRTEscala[7].x), getYint(verticesRTEscala[7].y));
       g.drawLine(getXint(verticesRTEscala[7].x), getYint(verticesRTEscala[7].y), getXint(verticesRTEscala[0].x), getYint(verticesRTEscala[0].y));


       //nova questão

       for (int i = 0; i < vertices.length; i++) {
           verticesEscala [i] = Ex_Trasf2D.escala(vertices[i], 2, 2);
       }

       g.setColor(Color.BLUE);
       g.drawLine(getXint(verticesEscala[0].x), getYint(verticesEscala[0].y), getXint(verticesEscala[1].x), getYint(verticesEscala[1].y));
       g.drawLine(getXint(verticesEscala[1].x), getYint(verticesEscala[1].y), getXint(verticesEscala[2].x), getYint(verticesEscala[2].y));
       g.drawLine(getXint(verticesEscala[2].x), getYint(verticesEscala[2].y), getXint(verticesEscala[3].x), getYint(verticesEscala[3].y));
       g.drawLine(getXint(verticesEscala[3].x), getYint(verticesEscala[3].y), getXint(verticesEscala[4].x), getYint(verticesEscala[4].y));
       g.drawLine(getXint(verticesEscala[4].x), getYint(verticesEscala[4].y), getXint(verticesEscala[5].x), getYint(verticesEscala[5].y));
       g.drawLine(getXint(verticesEscala[5].x), getYint(verticesEscala[5].y), getXint(verticesEscala[6].x), getYint(verticesEscala[6].y));
       g.drawLine(getXint(verticesEscala[6].x), getYint(verticesEscala[6].y), getXint(verticesEscala[7].x), getYint(verticesEscala[7].y));
       g.drawLine(getXint(verticesEscala[7].x), getYint(verticesEscala[7].y), getXint(verticesEscala[0].x), getYint(verticesEscala[0].y));

       for (int i = 0; i < verticesEscala.length; i++) {
           verticesERotacionados [i] = Ex_Trasf2D.rotacao(verticesEscala[i], 60);
       }

       g.setColor(Color.PINK);
       g.drawLine(getXint(verticesERotacionados[0].x), getYint(verticesERotacionados[0].y), getXint(verticesERotacionados[1].x), getYint(verticesERotacionados[1].y));
       g.drawLine(getXint(verticesERotacionados[1].x), getYint(verticesERotacionados[1].y), getXint(verticesERotacionados[2].x), getYint(verticesERotacionados[2].y));
       g.drawLine(getXint(verticesERotacionados[2].x), getYint(verticesERotacionados[2].y), getXint(verticesERotacionados[3].x), getYint(verticesERotacionados[3].y));
       g.drawLine(getXint(verticesERotacionados[3].x), getYint(verticesERotacionados[3].y), getXint(verticesERotacionados[4].x), getYint(verticesERotacionados[4].y));
       g.drawLine(getXint(verticesERotacionados[4].x), getYint(verticesERotacionados[4].y), getXint(verticesERotacionados[5].x), getYint(verticesERotacionados[5].y));
       g.drawLine(getXint(verticesERotacionados[5].x), getYint(verticesERotacionados[5].y), getXint(verticesERotacionados[6].x), getYint(verticesERotacionados[6].y));
       g.drawLine(getXint(verticesERotacionados[6].x), getYint(verticesERotacionados[6].y), getXint(verticesERotacionados[7].x), getYint(verticesERotacionados[7].y));
       g.drawLine(getXint(verticesERotacionados[7].x), getYint(verticesERotacionados[7].y), getXint(verticesERotacionados[0].x), getYint(verticesERotacionados[0].y));

       for (int i = 0; i < verticesERotacionados.length; i++) {
           verticesERTranslacionados [i] = Ex_Trasf2D.translacao(verticesERotacionados[i], 3, 2);
       }

       g.setColor(Color.CYAN);
       g.drawLine(getXint(verticesERTranslacionados[0].x), getYint(verticesERTranslacionados[0].y), getXint(verticesERTranslacionados[1].x), getYint(verticesERTranslacionados[1].y));
       g.drawLine(getXint(verticesERTranslacionados[1].x), getYint(verticesERTranslacionados[1].y), getXint(verticesERTranslacionados[2].x), getYint(verticesERTranslacionados[2].y));
       g.drawLine(getXint(verticesERTranslacionados[2].x), getYint(verticesERTranslacionados[2].y), getXint(verticesERTranslacionados[3].x), getYint(verticesERTranslacionados[3].y));
       g.drawLine(getXint(verticesERTranslacionados[3].x), getYint(verticesERTranslacionados[3].y), getXint(verticesERTranslacionados[4].x), getYint(verticesERTranslacionados[4].y));
       g.drawLine(getXint(verticesERTranslacionados[4].x), getYint(verticesERTranslacionados[4].y), getXint(verticesERTranslacionados[5].x), getYint(verticesERTranslacionados[5].y));
       g.drawLine(getXint(verticesERTranslacionados[5].x), getYint(verticesERTranslacionados[5].y), getXint(verticesERTranslacionados[6].x), getYint(verticesERTranslacionados[6].y));
       g.drawLine(getXint(verticesERTranslacionados[6].x), getYint(verticesERTranslacionados[6].y), getXint(verticesERTranslacionados[7].x), getYint(verticesERTranslacionados[7].y));
       g.drawLine(getXint(verticesERTranslacionados[7].x), getYint(verticesERTranslacionados[7].y), getXint(verticesERTranslacionados[0].x), getYint(verticesERTranslacionados[0].y));

   } // fim do método paintComponent
} // fim da classe ColorJPanel


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/