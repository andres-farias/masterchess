package cl.azulprofundo.masterchess.model.board;

public enum BoardColumnsEnum {

    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7),
    H(8);

    private int value;

    BoardColumnsEnum(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
