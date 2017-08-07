package com.ssh.util;

import java.util.ArrayList;
import java.util.List;

import com.ssh.entity.Tree;

public class TreeUtil {
	
	public final static List<Tree> getFatherNode(List<Tree> treeList){
		List<Tree> newTreeList  = new ArrayList<Tree>();
		for (Tree tree : treeList) {
			if(tree.getPid() ==null){
				//获取父节点先的子节点
				tree.setChildren(getChildrenNode(tree.getId(), treeList));
				tree.setState("open");
				newTreeList.add(tree);
				
			}
		}
		return newTreeList;
	}

	private final static List<Tree> getChildrenNode(String pid,List<Tree> treeList){
		List<Tree> newTreeList  = new ArrayList<Tree>();
		for (Tree tree : treeList ) {
			if(tree.getPid() == null) continue;
			//这是一个子节点
			if(tree.getPid().equals(pid)){
				//递归回去子节点下的子节点
				tree.setChildren(getChildrenNode(tree.getId(), treeList));
				newTreeList.add(tree);
			}	
		}
		return newTreeList;
	}
}
