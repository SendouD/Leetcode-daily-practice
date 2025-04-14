# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def buildTree(self, p, i):
        if not p or not i:
            return None
        root=TreeNode(p[0])
        mid=i.index(p[0])
        root.left=self.buildTree(p[1:mid+1],i[:mid])
        root.right=self.buildTree(p[mid+1:],i[mid+1:])
        return root

        """
        :type preorder: List[int]
        :type inorder: List[int]
        :rtype: Optional[TreeNode]
        """
        