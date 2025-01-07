document.addEventListener('DOMContentLoaded', () => {
    const board = document.getElementById('board');
    const resetButton = document.getElementById('reset');
    let currentPlayer = 'X';
    let boardState = ['', '', '', '', '', '', '', '', ''];

    // Initialize the board with clickable cells
    function createBoard() {
        board.innerHTML = '';
        for (let i = 0; i < 9; i++) {
            const cell = document.createElement('div');
            cell.classList.add('cell');
            cell.dataset.index = i;
            cell.addEventListener('click', handleCellClick);
            board.appendChild(cell);
        }
    }

    // Handle cell clicks (game logic)
    function handleCellClick(event) {
        const cell = event.target;
        const index = cell.dataset.index;

        // Prevent updating if the cell is already occupied
        if (boardState[index] !== '') return;

        boardState[index] = currentPlayer;
        cell.textContent = currentPlayer;

        // Check for winner
        if (checkWinner()) {
            alert(`${currentPlayer} Wins!`);
            resetGame();
        } else if (boardState.every(cell => cell !== '')) {
            alert('It\'s a Draw!');
            resetGame();
        } else {
            currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
        }
    }

    // Check for a winner
    function checkWinner() {
        const winningCombinations = [
            [0, 1, 2], [3, 4, 5], [6, 7, 8],
            [0, 3, 6], [1, 4, 7], [2, 5, 8],
            [0, 4, 8], [2, 4, 6]
        ];

        return winningCombinations.some(combination => {
            const [a, b, c] = combination;
            return boardState[a] && boardState[a] === boardState[b] && boardState[a] === boardState[c];
        });
    }

    // Reset the game
    function resetGame() {
        boardState = ['', '', '', '', '', '', '', '', ''];
        currentPlayer = 'X';
        createBoard();
    }

    // Initialize the board
    createBoard();

    // Reset button click handler
    resetButton.addEventListener('click', resetGame);
});
