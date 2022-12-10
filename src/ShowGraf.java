//package Grafico2D;

// Fig. 12.6: ShowColors.java
// Demonstrando Colors.
import javax.swing.JFrame;

public class ShowGraf
{
   // executa o aplicativo
   public static void main( String args[] )
   {
      // cria o frame para ColorJPanel
      JFrame frame = new JFrame( "Using colors" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      GrafJPanel gJPanel = new GrafJPanel(); // cria ColorJPanel
      frame.add( gJPanel ); // adiciona colorJPanel ao frame
      frame.setSize( 800, 600 ); // configura o tamanho do frame
      frame.setVisible( true ); // exibe o frame
      
   } // fim de main
} // fim da classe ShowColors


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