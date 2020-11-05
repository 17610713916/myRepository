package exercise.leetcode;


import exercise.leetcode.bean.BinaryTreePreOrderBean;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreOrder {

    public List<Integer> preorder(BinaryTreePreOrderBean root) {
        LinkedList<BinaryTreePreOrderBean> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            BinaryTreePreOrderBean node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for (BinaryTreePreOrderBean item : node.children) {
                stack.add(item);
            }
        }
        return output;

    }

}
