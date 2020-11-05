package exercise.leetcode.bean;

import java.util.List;

public class BinaryTreePreOrderBean {

    public int val;
    public List<BinaryTreePreOrderBean> children;

    public BinaryTreePreOrderBean() {}

    public BinaryTreePreOrderBean(int _val) {
        val = _val;
    }

    public BinaryTreePreOrderBean(int _val, List<BinaryTreePreOrderBean> _children) {
        val = _val;
        children = _children;
    }
}
