/**
 *  Java home work 6
 *
 * @author Denisov Alexey
 * @version dated Oct 28, 2018
 */

import java.util.Random;

public class BinaryTree {


    public static void main(String[] args)  {

        double good = 0;
        double bad = 0;
        double total;


        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            Tree tree = new TreeImpl();
            System.out.println("Tree No: " + (i + 1));

            for (int j = 0; j < 100; j++) {
                int num = rnd.nextInt(41) - 20;
                int rndAge = rnd.nextInt(61) + 20;
                tree.add(new Person(num, "Petr", rndAge));
                if (TreeImpl.heightOfBinaryTree(((TreeImpl) tree).root) == 4)
                    break;
            }

            if (TreeImpl.isBalanced(((TreeImpl) tree).root)) {
                good++;
                System.out.println(" симметрично");
            }
             else {
                bad++;
                System.out.println(" не симметрично");
            }
            total = good/(good + bad)*100;
            String fd = String.format("%.2f", total);

            System.out.println(TreeImpl.heightOfBinaryTree(((TreeImpl) tree).root));
            tree.display();
            System.out.println("Итого симметричных: " + fd + " %");
//            System.out.println(tree.getSize());

        }

    }
}

