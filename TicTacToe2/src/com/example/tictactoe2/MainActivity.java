package com.example.tictactoe2;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	private int turn = 1;
	private int[][] board;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		board = new int[3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				board[i][j] = 0;
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void onClick(View v){
		TextView text = (TextView)findViewById(R.id.textView1);
		switch(v.getId()){
			case R.id.button1:
				Button but1 = (Button)findViewById(R.id.button1);
				if(turn == 0)
					but1.setText("X");
				if(turn == 1)
					but1.setText("O");
				endTurn(1);
				text.setText("Button1");
				break;
			case R.id.button2:
				Button but2 = (Button)findViewById(R.id.button2);
				if(turn == 0)
					but2.setText("X");
				if(turn == 1)
					but2.setText("O");
				endTurn(2);
				text.setText("Button2");
				break;
			case R.id.button3:
				Button but3 = (Button)findViewById(R.id.button3);
				if(turn == 0)
					but3.setText("X");
				if(turn == 1)
					but3.setText("O");
				endTurn(3);
				text.setText("Button3");
				break;
			case R.id.button4:
				Button but4 = (Button)findViewById(R.id.button4);
				if(turn == 0)
					but4.setText("X");
				if(turn == 1)
					but4.setText("O");
				endTurn(4);
				text.setText("Button4");
				break;
			case R.id.button5:
				Button but5 = (Button)findViewById(R.id.button5);
				if(turn == 0)
					but5.setText("X");
				if(turn == 1)
					but5.setText("O");
				endTurn(5);
				break;
			case R.id.button6:
				Button but6 = (Button)findViewById(R.id.button6);
				if(turn == 0)
					but6.setText("X");
				if(turn == 1)
					but6.setText("O");
				endTurn(6);
				break;
			case R.id.button7:
				Button but7 = (Button)findViewById(R.id.button7);
				if(turn == 0)
					but7.setText("X");
				if(turn == 1)
					but7.setText("O");
				endTurn(7);
				break;
			case R.id.button8:
				Button but8 = (Button)findViewById(R.id.button8);
				if(turn == 0)
					but8.setText("X");
				if(turn == 1)
					but8.setText("O");
				endTurn(8);
				break;
			case R.id.button9:
				Button but9 = (Button)findViewById(R.id.button9);
				if(turn == 0)
					but9.setText("X");
				if(turn == 1)
					but9.setText("O");
				endTurn(9);
				break;
		}
	}
	
	private void endTurn(int button){
		if(button == 1){
			if(turn == 0)
				board[0][0] = 1;
			if(turn == 1)
				board[0][0] = 2;
		}
		if(button == 2){
			if(turn == 0)
				board[1][0] = 1;
			if(turn == 1)
				board[1][0] = 2;
		}
		if(button == 3){
			if(turn == 0)
				board[2][0] = 1;
			if(turn == 1)
				board[2][0] = 2;
		}
		if(button == 4){
			if(turn == 0)
				board[0][1] = 1;
			if(turn == 1)
				board[0][1] = 2;
		}
		if(button == 5){
			if(turn == 0)
				board[1][1] = 1;
			if(turn == 1)
				board[1][1] = 2;
		}
		if(button == 6){
			if(turn == 0)
				board[2][1] = 1;
			if(turn == 1)
				board[2][1] = 2;
		}
		if(button == 7){
			if(turn == 0)
				board[0][2] = 1;
			if(turn == 1)
				board[0][2] = 2;
		}
		if(button == 8){
			if(turn == 0)
				board[1][2] = 1;
			if(turn == 1)
				board[1][2] = 2;
		}
		if(button == 9){
			if(turn == 0)
				board[2][2] = 1;
			if(turn == 1)
				board[2][2] = 2;
		}
	}
}
