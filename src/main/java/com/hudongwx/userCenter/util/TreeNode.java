package com.hudongwx.userCenter.util;

/**
 * Created by wuhongxu on 2016/9/4 0004.
 */
public interface TreeNode {
    public void setChildCount(Integer childCount);

    public Integer getChildCount();

    public void setDegree(Integer degree);

    public Integer getDegree();

    public TreeNode getParent();

    public void setParent(TreeNode treeNode);

    public void setLeftChild(TreeNode treeNode);

    public TreeNode getLeftChild();

    public void setNextSibling(TreeNode treeNode);

    public TreeNode getNextSibling();
}
