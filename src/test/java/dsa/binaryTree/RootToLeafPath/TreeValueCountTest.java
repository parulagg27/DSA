package dsa.binaryTree.RootToLeafPath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class TreeValueCountTest {

    //TODO: Add rest of test cases from structy

    @Nested
    class CountViaRecursion {
        @Test
        void shouldReturn0IfRootIsNull() {
            var output = TreeValueCount.treeValueCount(null, 42);

            Assertions.assertEquals(0, output);
        }
    }

    @Nested
    class CountViaPreOrderStack {

        @Test
        void shouldReturn0IfRootIsNull() {
            var output = TreeValueCount.treeValueCountViaPreOrder(null, 42);

            Assertions.assertEquals(0, output);
        }
    }
}