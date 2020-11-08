import structure.Knot;

import java.util.ArrayList;

public class AvlTree {
    protected Knot raiz;

    public void inserir(int k) {
        Knot n = new Knot(k);
        inserirAVL(this.raiz, n);
    }

    public void inserirAVL(Knot aComparar, Knot aInserir) {

        if (aComparar == null) {
            this.raiz = aInserir;

        } else {

            if (aInserir.getValue() < aComparar.getValue()) {

                if (aComparar.getLeft() == null) {
                    aComparar.setLeft(aInserir);
                    aInserir.setDad(aComparar);
                    verificarBalanceamento(aComparar);

                } else {
                    inserirAVL(aComparar.getLeft(), aInserir);
                }

            } else if (aInserir.getValue() > aComparar.getValue()) {

                if (aComparar.getRight() == null) {
                    aComparar.setRight(aInserir);
                    aInserir.setDad(aComparar);
                    verificarBalanceamento(aComparar);

                } else {
                    inserirAVL(aComparar.getRight(), aInserir);
                }

            } else {
                // O nó já existe
            }
        }
    }

    public void verificarBalanceamento(Knot atual) {
        setBalancing(atual);
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

        if (atual.getDad() != null) {
            verificarBalanceamento(atual.getDad());
        } else {
            this.raiz = atual;
        }
    }

    public void remover(int k) {
        removerAVL(this.raiz, k);
    }

    public void removerAVL(Knot atual, int k) {
        if (atual == null) {
            return;

        } else {

            if (atual.getValue() > k) {
                removerAVL(atual.getLeft(), k);

            } else if (atual.getValue() < k) {
                removerAVL(atual.getRight(), k);

            } else if (atual.getValue() == k) {
                removerNoEncontrado(atual);
            }
        }
    }

    public void removerNoEncontrado(Knot aRemover) {
        Knot r;

        if (aRemover.getLeft() == null || aRemover.getRight() == null) {

            if (aRemover.getDad() == null) {
                this.raiz = null;
                aRemover = null;
                return;
            }
            r = aRemover;

        } else {
            r = sucessor(aRemover);
            aRemover.setValue(r.getValue());
        }

        Knot p;
        if (r.getLeft() != null) {
            p = r.getLeft();
        } else {
            p = r.getRight();
        }

        if (p != null) {
            p.setDad(r.getDad());
        }

        if (r.getDad() == null) {
            this.raiz = p;
        } else {
            if (r == r.getDad().getLeft()) {
                r.getDad().setLeft(p);
            } else {
                r.getDad().setRight(p);
            }
            verificarBalanceamento(r.getDad());
        }
        r = null;
    }

    public Knot rotacaoEsquerda(Knot inicial) {

        Knot direita = inicial.getRight();
        direita.setDad(inicial.getDad());

        inicial.setRight(direita.getLeft());

        if (inicial.getRight() != null) {
            inicial.getRight().setDad(inicial);
        }

        direita.setLeft(inicial);
        inicial.setDad(direita);

        if (direita.getDad() != null) {

            if (direita.getDad().getRight() == inicial) {
                direita.getDad().setRight(direita);

            } else if (direita.getDad().getLeft() == inicial) {
                direita.getDad().setLeft(direita);
            }
        }

        setBalancing(inicial);
        setBalancing(direita);

        return direita;
    }

    public Knot rotacaoDireita(Knot inicial) {

        Knot esquerda = inicial.getLeft();
        esquerda.setDad(inicial.getDad());

        inicial.setLeft(esquerda.getRight());

        if (inicial.getLeft() != null) {
            inicial.getLeft().setDad(inicial);
        }

        esquerda.setRight(inicial);
        inicial.setDad(esquerda);

        if (esquerda.getDad() != null) {

            if (esquerda.getDad().getRight() == inicial) {
                esquerda.getDad().setRight(esquerda);

            } else if (esquerda.getDad().getLeft() == inicial) {
                esquerda.getDad().setLeft(esquerda);
            }
        }

        setBalancing(inicial);
        setBalancing(esquerda);

        return esquerda;
    }

    public Knot duplaRotacaoEsquerdaDireita(Knot inicial) {
        inicial.setLeft(rotacaoEsquerda(inicial.getLeft()));
        return rotacaoDireita(inicial);
    }

    public Knot duplaRotacaoDireitaEsquerda(Knot inicial) {
        inicial.setRight(rotacaoDireita(inicial.getRight()));
        return rotacaoEsquerda(inicial);
    }

    public Knot sucessor(Knot q) {
        if (q.getRight() != null) {
            Knot r = q.getRight();
            while (r.getLeft() != null) {
                r = r.getLeft();
            }
            return r;
        } else {
            Knot p = q.getDad();
            while (p != null && q == p.getRight()) {
                q = p;
                p = q.getDad();
            }
            return p;
        }
    }

    private int altura(Knot atual) {
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

    private void setBalancing(Knot no) {
        no.setBalancing(altura(no.getRight()) - altura(no.getLeft()));
    }

    final protected ArrayList<Knot> inorder() {
        ArrayList<Knot> ret = new ArrayList<Knot>();
        inorder(raiz, ret);
        return ret;
    }

    final protected void inorder(Knot no, ArrayList<Knot> lista) {
        if (no == null) {
            return;
        }
        inorder(no.getLeft(), lista);
        lista.add(no);
        inorder(no.getRight(), lista);
    }
}
