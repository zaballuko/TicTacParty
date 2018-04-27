window.onload = function() {
	var oUi = new GameUi();
	var oCtrl = new GameCtrl(oUi);
	oUi.setCtrl(oCtrl);
	oCtrl.startGame();
}

/*----------------------------------------*/

/*my little tool*/
var Tool = {
	getE: function(/*string*/sName) {
		var sType = sName[0];
		sName = sName.split(sType)[1];
		switch(sType) {
			case '#':
				return document.getElementById(sName);
			case '.':
				var aResult = new Array();
				var aObj = document.getElementsByTagName('*');
				for(var i = aObj.length - 1; i >= 0; i--) {
					if(aObj[i].className && aObj[i].className.indexOf(sName) != -1) {
						aResult.push(aObj[i]);
					}
				}
				return aResult;
			default:
				return document.getElementsByTagName(sName);
		}
	}
};

/*---------------------------------------*/

function GameUi() {
	var oCtrl,
		aBlocks,
		sPlayerStyle,
		sAiStyle;

	var init = function() {
			aBlocks = Tool.getE('.block');
		},
		startGame = function() {
			clean();
			startScreen();
		},
		startScreen = function() {
			var oScreen = Tool.getE('#start_screen');
				selectO = Tool.getE('#selectO'),
				selectX = Tool.getE('#selectX');
			oScreen.style['display'] = 'block';
			selectX.onmouseover = function() {
				selectO.className = '';
				this.className = 'current';
			}
			selectO.onmouseover = function() {
				selectX.className = '';
				this.className = 'current';
			}
			selectX.onclick = function() {
				sPlayerStyle = 'x';
				sAiStyle = 'o';
				oScreen.style['display'] = 'none';
				setupListener();
			}
			selectO.onclick = function() {
				sPlayerStyle = 'o';
				sAiStyle = 'x';
				oScreen.style['display'] = 'none';
				oCtrl.nextStep();
				setupListener();
			}
		},
		setupListener = function() {
			for (var i = aBlocks.length - 1; i >= 0; i--) {
				(function(index) {
					aBlocks[index].onclick = function() {
						if (aBlocks[index].innerHTML != '') return;
						draw('player', index);
						oCtrl.setChessboard(index, -1);
						oCtrl.nextStep();
					}
				})(i);
			}
		},
		endGame = function() {
			endScreen();
		},
		endScreen = function() {
			var audio = new Audio('audio/audiooh.mp3');
			var contadorGanar;
			var contadorPerder;
			var contadorPartidas;
			var oScreen = Tool.getE('#end_screen');
			var oEndInfo = Tool.getE('#end_info');
			
			
			switch(oCtrl.getWinner()) {
				case 'ai':
					oEndInfo.innerHTML = 'ohh..';
					contadorPerder ++;
					audio.play();
				

					break;
				case 'player':
					oEndInfo.innerHTML = 'winner';
					contadorGanar++;
					audio.play();
					
					break;
				case 'no':
					oEndInfo.innerHTML = 'Empate';
					
					break;
			}
			contadorPartidas++;
			

			//enviar datos a jsp para guardar numero departidas
					//$.post( "http://10.14.3.86/TicTacParty/GuardarNumPartida",  { numPartidas: contadorPartidas})
  						//.done(function( data ) {
   							// alert( "Data Loaded: " + data );
  					//});

			oScreen.style['display'] = 'block';
			var btnRestart = Tool.getE('#btn_restart');
				btnRestart.onclick = function() {
				oScreen.style['display'] = 'none';
				oCtrl.startGame();
			}
		},
		draw = function(/*string*/role, /*num*/index) {
			var obj = aBlocks[index];
			switch (role) {
				case 'ai':
					obj.innerHTML = '<div class="' + sAiStyle +'"></div>';
					break;
				case 'player':
					obj.innerHTML = '<div class="' + sPlayerStyle +'"></div>';
					break;
				default:
					break;
			}
		},
		clean = function() {
			for (var i = aBlocks.length - 1; i >= 0; i--) {
				aBlocks[i].innerHTML = '';
			}
		};
	init();

	return {
		setCtrl: function(_oCtrl) {
			oCtrl = _oCtrl;
		},
		startGame: function() {
			startGame();
		},
		endGame: function() {
			endGame();
		},
		draw: function(/*string*/role, /*obj*/obj) {
			draw(/*string*/role, /*obj*/obj);
		}
	}
}

/*-----------------------------------*/

function GameCtrl(/*obj*/_oUi) {
	var oUi,
		winner,
		aChessboard,
		aWinCondition;

	var init = function() {
			oUi = _oUi;
			aChessboard = [0,0,0,0,0,0,0,0,0],
			aWinCondition = [[0,1,2],[3,4,5],[6,7,8],[0,3,6],[1,4,7],[2,5,8],[0,4,8],[2,4,6]];
		},
		checkOver = function() {
			for (var i = aWinCondition.length - 1; i >= 0; i--) {
				if (aChessboard[aWinCondition[i][0]] + aChessboard[aWinCondition[i][1]] + aChessboard[aWinCondition[i][2]] == 3) {
					winner = 'ai';
					oUi.endGame();
					return true;
				}
				if (aChessboard[aWinCondition[i][0]] + aChessboard[aWinCondition[i][1]] + aChessboard[aWinCondition[i][2]] == -3) {
					winner = 'player';
					oUi.endGame();
					return true;
				}
			}
			var count = 0;
			for (var i = aWinCondition.length - 1; i >= 0; i--) {
				if (aChessboard[i] != 0) count++;
			}
			if (count == 8) {
				winner = 'no';
				oUi.endGame();
				return true;
			}
			return false;
		},
		nextStep = function() {
			if (!checkOver()) {
				var nMax = null, nMaxSub, aChessboards = new Array();
				for (var i = 8; i >= 0; i--) {
					
					for (var i2 = 8; i2 >= 0; i2--) {
						if (aChessboard[i2] != 0) continue;
						aChessboard[i2] = 1;
						for (var k = aWinCondition.length - 1; k >= 0; k--) {
							if (aChessboard[aWinCondition[k][0]] + aChessboard[aWinCondition[k][1]] + 
								aChessboard[aWinCondition[k][2]] == 3) {
								//aChessboard[i] = 1;//change chessboard
								console.log(i2)
								oUi.draw('ai', i2);
								checkOver();
								return;
							}
						}
						aChessboard[i2] = 0;
					}

					if (aChessboard[i] != 0) continue;
					aChessboard[i] = 1;
					/*if(checkSame(aChessboards, aChessboard)) {
						break;
					} else {
						aChessboards.push(aChessboard);
					}*/

					var aTempCb = aChessboard.concat();
					var nMin = null;
					var aTempCbs = new Array();
					for (var j = 8; j >= 0; j--) {
						if (aTempCb[j] != 0) continue;
						aTempCb[j] = -1;//guess
						for (var k = aWinCondition.length - 1; k >= 0; k--) {
							if (aTempCb[aWinCondition[k][0]] + aTempCb[aWinCondition[k][1]] + 
								aTempCb[aWinCondition[k][2]] == -3) {
								aChessboard[j] = 1;//change chessboard
								aChessboard[i] = 0;
								oUi.draw('ai', j);
								checkOver();
								return;
							}
						}
						/*if(checkSame(aTempCbs, aTempCb)) {
							break;
						} else {
							aTempCbs.push(aTempCb);
						}*/

						var nMax2 = 0, nMin2 = 0,
							aTempCbMax = aTempCb.concat(),
							aTempCbMin = aTempCb.concat();
						for (var l = 8; l >= 0; l--) {
							if (aTempCbMax[l] == 0) {
								aTempCbMax[l] = 1;
							}
							if (aTempCbMin[l] == 0) {
								aTempCbMin[l] = -1;
							}
						}
						for (var m = aWinCondition.length - 1; m >= 0; m--) {
							if (aTempCbMax[aWinCondition[m][0]] + aTempCbMax[aWinCondition[m][1]] + aTempCbMax[aWinCondition[m][2]] == 3)
								nMax2++;
							if (aTempCbMin[aWinCondition[m][0]] + aTempCbMin[aWinCondition[m][1]] + aTempCbMin[aWinCondition[m][2]] == -3) {
								nMin2++;
							}
						}
						var nDiff = nMax2 - nMin2;

						if (nMin == null) {
							nMin = nDiff;
						} else {
							nMin = nMin > nDiff ? nDiff : nMin;
						}
						aTempCb[j] = 0;
					}

					if (nMax == null) {
						nMax = nMin;
						nMaxSub = i;
					} else {
						if (nMax < nMin) {
							nMax = nMin;
							nMaxSub = i;
						}
					}
					aChessboard[i] = 0;
				}
				aChessboard[nMaxSub] = 1;
				oUi.draw('ai', nMaxSub);
				checkOver();
			} else {
				
			}
		}
	init();

	return {
		startGame: function() {
			aChessboard = [0,0,0,0,0,0,0,0,0];
			oUi.startGame();
		},
		nextStep: function(/*num*/nPlayerStep) {
			nextStep();
		},
		setChessboard: function(/*num*/index, /*num*/val) {
			aChessboard[index] = val;
		},
		getWinner: function() {
			return winner;
		}
	}
}