/**
 * 
 */

/**
 * @author moises.alonso
 *
 */
/**
 * Represents a node in a binary tree, with a priority and a value.
 *
 * @param <P> the type of the priority
 * @param <V> the type of the value
 */
public class TreeNode<P, V> {

	private P _priority;
	private V _value;
	TreeNode<P, V> _parent;
	TreeNode<P, V> _left;
	TreeNode<P, V> _right;

	/**
	 * Constructs a new TreeNode object with the given priority and value.
	 *
	 * @param priority the priority of the node
	 * @param value the value of the node
	 */
	public TreeNode(P priority, V value) {
		set_priority(priority);
		set_value(value);
		set_parent(null);
		set_left(null);
		set_right(null);
	}

	/**
	 * Returns the priority of the node.
	 *
	 * @return the priority of the node
	 */
	public P get_priority() {
		return _priority;
	}

	/**
	 * Sets the priority of the node to the given value.
	 *
	 * @param _priority the new priority value to be set
	 */
	public void set_priority(P _priority) {
		this._priority = _priority;
	}

	/**
	 * Returns the value of the node.
	 *
	 * @return the value of the node
	 */
	public V get_value() {
		return _value;
	}

	/**
	 * Sets the value of the node to the given value.
	 *
	 * @param _value the new value to be set
	 */
	public void set_value(V _value) {
		this._value = _value;
	}

	/**
	 * Returns the parent node of this node.
	 *
	 * @return the parent node of this node
	 */
	public TreeNode<P, V> get_parent() {
		return _parent;
	}

	/**
	 * Sets the parent node of this node to the given node.
	 *
	 * @param _parent the new parent node to be set
	 */
	public void set_parent(TreeNode<P, V> _parent) {
		this._parent = _parent;
	}

	/**
	 * Returns the left child node of this node.
	 *
	 * @return the left child node of this node
	 */
	public TreeNode<P, V> get_left() {
		return _left;
	}

	/**
	 * Sets the left child node of this node to the given node.
	 *
	 * @param _left the new left child node to be set
	 */
	public void set_left(TreeNode<P, V> _left) {
		this._left = _left;
	}

	/**
	 * Returns the right child node of this node.
	 *
	 * @return the right child node of this node
	 */
	public TreeNode<P, V> get_right() {
		return _right;
	}

	/**
	 * Sets the right child node of this node to the given node.
	 *
	 * @param _right the new right child node to be set
	 */
	public void set_right(TreeNode<P, V> _right) {
		this._right = _right;
	}
}

