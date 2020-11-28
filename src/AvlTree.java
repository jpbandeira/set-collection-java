import java.util.ArrayList;

public class AvlTree {

  protected No root;

	public boolean insert(int k) {
		No n = new No(k);
		return insertAVL(this.root, n);
	}

	@Override
	public String toString() {
		return "AvlTree [root=" + root + "]";
	}

	public boolean insertAVL(No toCompare, No toInsert) {

		if (toCompare == null) {
			this.root = toInsert;
		} else {

			if (toInsert.getKey() < toCompare.getKey()) {

				if (toCompare.getLeft() == null) {
					toCompare.setLeft(toInsert);
					toInsert.setRoot(toCompare);
					verifyBalancing(toCompare);

				} else {
					insertAVL(toCompare.getLeft(), toInsert);
				}

			} else if (toInsert.getKey() > toCompare.getKey()) {

				if (toCompare.getRight() == null) {
					toCompare.setRight(toInsert);
					toInsert.setRoot(toCompare);
					verifyBalancing(toCompare);

				} else {
					insertAVL(toCompare.getRight(), toInsert);
				}
				
			} else {
				return false;
			}
		}
		return true;
	}

	public void verifyBalancing(No current) {
		setBalancing(current);
		int balancing = current.getBalancing();

		if (balancing == -2) {

			if (height(current.getLeft().getLeft()) >= height(current.getLeft().getRight())) {
				current = rotationRight(current);

			} else {
				current = doubleRotatinLeftRight(current);
			}

		} else if (balancing == 2) {

			if (height(current.getRight().getRight()) >= height(current.getRight().getLeft())) {
				current = rotationLeft(current);

			} else {
				current = doubleRotationRightLeft(current);
			}
		}

		if (current.getRoot() != null) {
			verifyBalancing(current.getRoot());
		} else {
			this.root = current;
		}
	}

	public void remove(int k) {
		removeAVL(this.root, k);
	}

	public void removeAVL(No current, int k) {
		if (current == null) {
			return;

		} else {

			if (current.getKey() > k) {
				removeAVL(current.getLeft(), k);

			} else if (current.getKey() < k) {
				removeAVL(current.getRight(), k);

			} else if (current.getKey() == k) {
				removeKnotFounded(current);
			}
		}
	}

	public void removeKnotFounded(No toRemove) {
		No r;

		if (toRemove.getLeft() == null || toRemove.getRight() == null) {

			if (toRemove.getRoot() == null) {
				this.root = null;
				toRemove = null;
				return;
			}
			r = toRemove;

		} else {
			r = next(toRemove);
			toRemove.setKey(r.getKey());
		}

		No p;
		if (r.getLeft() != null) {
			p = r.getLeft();
		} else {
			p = r.getRight();
		}

		if (p != null) {
			p.setRoot(r.getRoot());
		}

		if (r.getRoot() == null) {
			this.root = p;
		} else {
			if (r == r.getRoot().getLeft()) {
				r.getRoot().setLeft(p);
			} else {
				r.getRoot().setRight(p);
			}
			verifyBalancing(r.getRoot());
		}
		r = null;
	}

	public No rotationLeft(No initial) {

		No right = initial.getRight();
		right.setRoot(initial.getRoot());

		initial.setRight(right.getLeft());

		if (initial.getRight() != null) {
			initial.getRight().setRoot(initial);
		}

		right.setLeft(initial);
		initial.setRoot(right);

		if (right.getRoot() != null) {

			if (right.getRoot().getRight() == initial) {
				right.getRoot().setRight(right);
			
			} else if (right.getRoot().getLeft() == initial) {
				right.getRoot().setLeft(right);
			}
		}

		setBalancing(initial);
		setBalancing(right);

		return right;
	}

	public No rotationRight(No initial) {

		No left = initial.getLeft();
		left.setRoot(initial.getRoot());

		initial.setLeft(left.getRight());

		if (initial.getLeft() != null) {
			initial.getLeft().setRoot(initial);
		}

		left.setRight(initial);
		initial.setRoot(left);

		if (left.getRoot() != null) {

			if (left.getRoot().getRight() == initial) {
				left.getRoot().setRight(left);
			
			} else if (left.getRoot().getLeft() == initial) {
				left.getRoot().setLeft(left);
			}
		}

		setBalancing(initial);
		setBalancing(left);

		return left;
	}

	public No doubleRotatinLeftRight(No initial) {
		initial.setLeft(rotationLeft(initial.getLeft()));
		return rotationRight(initial);
	}

	public No doubleRotationRightLeft(No initial) {
		initial.setRight(rotationRight(initial.getRight()));
		return rotationLeft(initial);
	}

	public No next(No q) {
		if (q.getRight() != null) {
			No r = q.getRight();
			while (r.getLeft() != null) {
				r = r.getLeft();
			}
			return r;
		} else {
			No p = q.getRoot();
			while (p != null && q == p.getRight()) {
				q = p;
				p = q.getRoot();
			}
			return p;
		}
	}

	private int height(No current) {
		if (current == null) {
			return -1;
		}

		if (current.getLeft() == null && current.getRight() == null) {
			return 0;
		
		} else if (current.getLeft() == null) {
			return 1 + height(current.getRight());
		
		} else if (current.getRight() == null) {
			return 1 + height(current.getLeft());
		
		} else {
			return 1 + Math.max(height(current.getLeft()), height(current.getRight()));
		}
	}

	private void setBalancing(No no) {
		no.setBalancing(height(no.getRight()) - height(no.getLeft()));
	}

	final protected ArrayList<No> inorder() {
		ArrayList<No> ret = new ArrayList<No>();
		inorder(root, ret);
		return ret;
	}

	final protected void inorder(No no, ArrayList<No> lista) {
		if (no == null) {
			return;
		}
		inorder(no.getLeft(), lista);
		lista.add(no);
		inorder(no.getRight(), lista);
	}
	
	 public void preOrdem()
	 {
		 preOrdemFind( root );
	 }

	 public void preOrdemFind( No no )
	 {
	      if( no == null )
	       return;

	      System.out.println( no.getKey() + "" );

		 preOrdemFind( no.getLeft() );

		 preOrdemFind( no.getRight() );
	  }

	public boolean findAVL(No current, int k) {
		No knot = current;

		if (current == null) {
			knot = root;

		}

			if (knot.getKey() > k) {
				return knot.getLeft() != null ? findAVL(knot.getLeft(), k) : false;

			} else if (knot.getKey() < k) {
				return knot.getRight() != null ? findAVL(knot.getRight(), k) : false;

			} else if (knot.getKey() == k) {
				return true;
			}


		return false;
	}
}