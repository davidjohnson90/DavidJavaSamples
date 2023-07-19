package com.david.java.string;

import java.util.logging.Logger;

/**
 * This class represents a tree.
 */
class Tree {
}

/**
 * This class represents a pine tree, which is a subclass of Tree.
 */
class Pine extends Tree {
}

/**
 * This class represents an oak tree, which is a subclass of Tree.
 */
class Oak extends Tree {
}

/**
 * This class demonstrates the use of the instanceof operator to check object types.
 *
 * <p>Author: David</p>
 */
public class Forest {
    private static final Logger logger = Logger.getLogger(Forest.class.getName());

    /**
     * The main method creates instances of Tree subclasses and checks their types using the instanceof operator.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Create a Tree object that references a Pine instance
        Tree tree = new Pine();

        // Check if the tree is an instance of Pine and log the result
        if (tree instanceof Pine) {
            logger.info("Pine");
        }

        // Check if the tree is an instance of Tree and log the result
        if (tree instanceof Tree) {
            logger.info("Tree");
        }

        // Create a Tree object that references an Oak instance
        tree = new Oak();

        // Check if the tree is an instance of Oak and log the result
        if (tree instanceof Oak) {
            logger.info("Oak");
        } else {
            logger.info("Oops");
        }
    }
}
