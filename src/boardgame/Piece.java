package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.setBoard(board);
	}

	protected Board getBoard() {
		return board;
	}

	private void setBoard(Board board) {
		this.board = board;
	}
	
	

}
