<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.js"></script>
<script src="tictactoe.js"></script>
<script>
 $(function(){
	 // Main Game Handling class /
	 var TicTacToe = {
	     turn: "O",  // Keeps a record of who's turn it is
	     board: ["", "", "", "", "", "", "", "", "", ""],  // Keeps a record of the TicTacToe Board
	     win: false, // records who won if the game is over

	     // Clears and starts a new game with a new board /
	     restartGame: function() {
	       // Draw the board
	       var board_table = '<table cellpadding="0px" cellspacing="0px" align="center" border="0px" class="board"><tr><td id="ttt0"> </td><td id="ttt1"> </td><td id="ttt2"> </td></tr><tr><td id="ttt3"> </td><td id="ttt4"> </td><td id="ttt5"> </td></tr><tr><td id="ttt6"> </td><td id="ttt7"> </td><td id="ttt8"> </td></tr></table>';
	       $("#board").html(board_table);
	       $("#menu").hide();

	       // clear the board
	       this.board = ["", "", "", "", "", "", "", "", "", ""];

	       // Add on-click events to each of the boxes of the board
	       $("#board td").click(function(e) {
	           TicTacToe.move( e.target.id );
	          });

	     },

	     // Handles clicks spaces on the board /
	     move: function(id) {
	       var space = $("#" + id);  // Board space table element
	       var num = id.replace("ttt", ""); // # representing the space on the board

	       // If no one's gone there, and the game isn't over, go there!
	       if (!this.board[num] && !this.win) {
	         space.html( this.turn );
	         this.board[num] = this.turn;
	         this.nextTurn();  // End turn
	       }
	     },

	     // Iterate turn and check if anyone one yet /
	     nextTurn: function() {
	       this.turn = (this.turn == "O") ? "X" : "O";
	       this.win = this.check4Win();
	       if (this.win) {
	           this.endGame();
	       }
	     },

	     // Display who won and options for new games /
	     endGame: function() {

	       if (this.win == "Cat") {
	           $("#menu").html("Cats Game.");
	       } else {
	           $("#menu").html(this.win + " wins!");
	       }
	       $("#menu").append("<div id='play_again'>Play Again</div>");

	       // Button for playing again.
	       $("#play_again").click(function () { TicTacToe.restartGame();  });
	       $("#menu").show();
	       this.win = false;

	     },

	     // If any of these patters of board spaces have all X's or all O's somebody won!
	     wins: [[0,1,2], [3,4,5], [6,7,8], [0,3,6], [1,4,7], [2,5,8], [0,4,8], [6,4,2]],

	     // Check for whether someone won the game of it was a Cat's game. /
	     check4Win: function() {

	       // Loop through all possible winning combinations
	       for (k in this.wins){
	         var pattern = this.wins[k];
	             var p = this.board[pattern[0]] + this.board[pattern[1]] + this.board[pattern[2]];
	             if (p == "XXX") {
	               return "X";  // X Won!
	             } else if (p == "OOO") {
	               return "O";  // O Won!
	             }
	           }

	           // Check if all spaces in the board are filled, then its a Cat's game
	           var cnt = 0;
	           for (s in this.board) {
	             if (this.board[s]) { cnt+=1; }
	           }
	           if (cnt == 9) {
	             return "Cat";  // Cat's game!
	           }
	       }
	     };

	     $(document).ready(function() {

	         // Start a game!
	         TicTacToe.restartGame();
	     });
 })
</script>
<style>

table.board {
  border: 1px solid green;
  height: 600px;
  width: 600px;
}

body {
  text-align: center;
  align: center;
}

td {
  height: 200px;
  width: 200px;
  text-align: center;
  vertical-align: middle;
  font-size: 100px;
  font-weight: bold;
  font-color: green;
  font-family: geniva, verdana, helvetica;
  border: 1px solid green;
}

#menu {
  text-align: center;
  position: absolute;
  width: 400;
  height: 400;
  margin-left: 100px;
  margin-top: 100px;
  border: 5px double red;
  display: none;
  vertical-align: middle;
  background-color: white;
}

#play_again {
  font-size: 20px;
  color: green;
}

</style>


</head>
<body>

<table align="center" border="0px">
<tr><td>
<div id="menu"></div>
<div id="board"></div>
</td></tr>
</table>

</body>
</html>