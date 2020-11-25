import java.util.ArrayList;

public class AvlTree {

  protected No raiz;

	public boolean inserir(int k) {
		No n = new No(k);
		return inserirAVL(this.raiz, n);
	}

	@Override
	public String toString() {
		return "AvlTree [raiz=" + raiz + "]";
	}

	public boolean inserirAVL(No aComparar, No aInserir) {

		if (aComparar == null) {
			this.raiz = aInserir;
		} else {

			if (aInserir.getKey() < aComparar.getKey()) {

				if (aComparar.getLeft() == null) {
					aComparar.setLeft(aInserir);
					aInserir.setRoot(aComparar);
					verificarBalanceamento(aComparar);

				} else {
					inserirAVL(aComparar.getLeft(), aInserir);
				}

			} else if (aInserir.getKey() > aComparar.getKey()) {

				if (aComparar.getRight() == null) {
					aComparar.setRight(aInserir);
					aInserir.setRoot(aComparar);
					verificarBalanceamento(aComparar);

				} else {
					inserirAVL(aComparar.getRight(), aInserir);
				}
				
			} else {
				return false;
			}
		}
		return true;
	}

	public void verificarBalanceamento(No atual) {
		setBalanceamento(atual);
		int balanceamento = atual.getBalancing();

		if (balanceamento == -2) {

			if (altura(atual.getLeft().getLeft()) >= altura(atual.getLeft().getRight())) {
				atual = rotacaoDireita(atual);

			} else {
				atual = duplaRotacaoEsquerdaDireita(atual);
			}

		} else if (balanceamento == 2) {

			if (altura(atual.getRight().getRight()) >= altura(atual.getRight().getLeft())) {
				atual = rotacaoEsquerda(atual);

			} else {
				atual = duplaRotacaoDireitaEsquerda(atual);
			}
		}

		if (atual.getRoot() != null) {
			verificarBalanceamento(atual.getRoot());
		} else {
			this.raiz = atual;
		}
	}

	public void remover(int k) {
		removerAVL(this.raiz, k);
	}

	public void removerAVL(No atual, int k) {
		if (atual == null) {
			return;

		} else {

			if (atual.getKey() > k) {
				removerAVL(atual.getLeft(), k);

			} else if (atual.getKey() < k) {
				removerAVL(atual.getRight(), k);

			} else if (atual.getKey() == k) {
				removerNoEncontrado(atual);
			}
		}
	}

	public void removerNoEncontrado(No aRemover) {
		No r;

		if (aRemover.getLeft() == null || aRemover.getRight() == null) {

			if (aRemover.getRoot() == null) {
				this.raiz = null;
				aRemover = null;
				return;
			}
			r = aRemover;

		} else {
			r = sucessor(aRemover);
			aRemover.setKey(r.getKey());
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
			this.raiz = p;
		} else {
			if (r == r.getRoot().getLeft()) {
				r.getRoot().setLeft(p);
			} else {
				r.getRoot().setRight(p);
			}
			verificarBalanceamento(r.getRoot());
		}
		r = null;
	}

	public No rotacaoEsquerda(No inicial) {

		No direita = inicial.getRight();
		direita.setRoot(inicial.getRoot());

		inicial.setRight(direita.getLeft());

		if (inicial.getRight() != null) {
			inicial.getRight().setRoot(inicial);
		}

		direita.setLeft(inicial);
		inicial.setRoot(direita);

		if (direita.getRoot() != null) {

			if (direita.getRoot().getRight() == inicial) {
				direita.getRoot().setRight(direita);
			
			} else if (direita.getRoot().getLeft() == inicial) {
				direita.getRoot().setLeft(direita);
			}
		}

		setBalanceamento(inicial);
		setBalanceamento(direita);

		return direita;
	}

	public No rotacaoDireita(No inicial) {

		No esquerda = inicial.getLeft();
		esquerda.setRoot(inicial.getRoot());

		inicial.setLeft(esquerda.getRight());

		if (inicial.getLeft() != null) {
			inicial.getLeft().setRoot(inicial);
		}

		esquerda.setRight(inicial);
		inicial.setRoot(esquerda);

		if (esquerda.getRoot() != null) {

			if (esquerda.getRoot().getRight() == inicial) {
				esquerda.getRoot().setRight(esquerda);
			
			} else if (esquerda.getRoot().getLeft() == inicial) {
				esquerda.getRoot().setLeft(esquerda);
			}
		}

		setBalanceamento(inicial);
		setBalanceamento(esquerda);

		return esquerda;
	}

	public No duplaRotacaoEsquerdaDireita(No inicial) {
		inicial.setLeft(rotacaoEsquerda(inicial.getLeft()));
		return rotacaoDireita(inicial);
	}

	public No duplaRotacaoDireitaEsquerda(No inicial) {
		inicial.setRight(rotacaoDireita(inicial.getRight()));
		return rotacaoEsquerda(inicial);
	}

	public No sucessor(No q) {
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

	private int altura(No atual) {
		if (atual == null) {
			return -1;
		}

		if (atual.getLeft() == null && atual.getRight() == null) {
			return 0;
		
		} else if (atual.getLeft() == null) {
			return 1 + altura(atual.getRight());
		
		} else if (atual.getRight() == null) {
			return 1 + altura(atual.getLeft());
		
		} else {
			return 1 + Math.max(altura(atual.getLeft()), altura(atual.getRight()));
		}
	}

	private void setBalanceamento(No no) {
		no.setBalancing(altura(no.getRight()) - altura(no.getLeft()));
	}

	final protected ArrayList<No> inorder() {
		ArrayList<No> ret = new ArrayList<No>();
		inorder(raiz, ret);
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
	     preOrdemAjudante( raiz );
	 }

	 public void preOrdemAjudante( No no )
	 {
	      if( no == null )
	       return;

	      System.out.println( no.getKey() + "" );

	      preOrdemAjudante( no.getLeft() );

	      preOrdemAjudante( no.getRight() );
	  }

	public boolean buscarAVL(No atual, int k) {
		No knot = atual;

		if (atual == null) {
			knot = raiz;

		}

			if (knot.getKey() > k) {
				return knot.getLeft() != null ? buscarAVL(knot.getLeft(), k) : false;

			} else if (knot.getKey() < k) {
				return knot.getRight() != null ? buscarAVL(knot.getRight(), k) : false;

			} else if (knot.getKey() == k) {
				return true;
			}


		return false;
	}
}