package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		this.position = null; // por padrão, já vem null. (opcional)
	}

	protected Board getBoard() {
		return board;
	}

	//Não terá o set do Board, pois o tabulheiro não poderá ser alterado.
}
