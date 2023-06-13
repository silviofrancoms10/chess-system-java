package boardgame;

public class Piece {

        protected Position position;
        private Board board;

        public Piece(Board board) {
            this.board = board;
            position = null; // opcional, pois o Java já atribui null por padrão
        }

        protected Board getBoard() {
            return board;
        }
}
