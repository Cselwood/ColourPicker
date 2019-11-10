package com.example.colourpicker;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;

    TextView nameLabel;
    TextView hexLabel;
    TextView rgbLabel;
    TextView rgbaLabel;

    TextView hexPrompt;
    TextView rgbPrompt;
    TextView rgbaPrompt;

    View divider;

    Button[] allButtons;

    Button greenButton;
    Button yellowGreenButton;
    Button yellowButton;

    Button orangeYellowButton;
    Button orangeButton;
    Button redOrangeButton;

    Button redButton;
    Button violetRedButton;
    Button violetButton;

    Button blueVioletButton;
    Button blueButton;
    Button blueGreenButton;

    Button blackButton;
    Button greyButton;
    Button whiteButton;

    // Made global for scope reasons
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        allButtons = new Button[15];

        // Text Labels
        nameLabel = (TextView) findViewById(R.id.colourName);
        hexLabel = (TextView) findViewById(R.id.hexColourEdit);
        rgbLabel = (TextView) findViewById(R.id.rgbColourEdit);
        rgbaLabel = (TextView) findViewById(R.id.rgbaColourEdit);

        // Text Prompts
        hexPrompt = (TextView) findViewById(R.id.hexPrompt);
        rgbPrompt = (TextView) findViewById(R.id.rgbPrompt);
        rgbaPrompt = (TextView) findViewById(R.id.rgbaPrompt);
        divider = (View) findViewById(R.id.divider);

        // Color Buttons
        greenButton = (Button) findViewById(R.id.greenButton);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("green");
            }
        });

        yellowGreenButton = (Button) findViewById(R.id.yellowGreenButton);
        yellowGreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("yellowGreen");
            }
        });

        yellowButton = (Button) findViewById(R.id.yellowButton);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("yellow");
            }
        });

        orangeYellowButton = (Button) findViewById(R.id.orangeYellowButton);
        orangeYellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("orangeYellow");
            }
        });

        orangeButton = (Button) findViewById(R.id.orangeButton);
        orangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("orange");
            }
        });

        redOrangeButton = (Button) findViewById(R.id.redOrangeButton);
        redOrangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("redOrange");
            }
        });

        redButton = (Button) findViewById(R.id.redButton);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("red");
            }
        });

        violetRedButton = (Button) findViewById(R.id.violetRedButton);
        violetRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("violetRed");
            }
        });

        violetButton = (Button) findViewById(R.id.violetButton);
        violetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("violet");
            }
        });

        blueVioletButton = (Button) findViewById(R.id.blueVioletButton);
        blueVioletButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("blueViolet");
            }
        });

        blueButton = (Button) findViewById(R.id.blueButton);
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("blue");
            }
        });

        blueGreenButton = (Button) findViewById(R.id.blueGreenButton);
        blueGreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("blueGreen");
            }
        });

        blackButton = (Button) findViewById(R.id.blackButton);
        blackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("black");
            }
        });

        greyButton = (Button) findViewById(R.id.greyButton);
        greyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("grey");
            }
        });

        whiteButton = (Button) findViewById(R.id.whiteButton);
        whiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFromColourButton("white");
            }
        });

        // Setup Background Colors
        initialiseButtons();

        // Start Program on White Background
        updateInitial();
    }

    protected void updateFromColourButton(String colour) {

        switch (colour) {

            case "green":
                nameLabel.setText("Green");
                hexLabel.setText("#00FF00");
                rgbLabel.setText("0, 255, 0");
                rgbaLabel.setText(convertToRgba(0, 255, 0));

                nameLabel.setBackgroundResource(R.color.green);
                hexLabel.setBackgroundResource(R.color.green);
                rgbLabel.setBackgroundResource(R.color.green);
                rgbaLabel.setBackgroundResource(R.color.green);
                relativeLayout.setBackgroundResource(R.color.green);

                hexPrompt.setBackgroundResource(R.color.green);
                rgbPrompt.setBackgroundResource(R.color.green);
                rgbaPrompt.setBackgroundResource(R.color.green);

                nameLabel.setTextColor(Color.BLACK);
                hexLabel.setTextColor(Color.BLACK);
                rgbLabel.setTextColor(Color.BLACK);
                rgbaLabel.setTextColor(Color.BLACK);

                hexPrompt.setTextColor(Color.BLACK);
                rgbPrompt.setTextColor(Color.BLACK);
                rgbaPrompt.setTextColor(Color.BLACK);
                divider.setBackgroundResource(R.color.black);
                break;

            case "yellowGreen":
                nameLabel.setText("Yellow Green");
                hexLabel.setText("#C3D938");
                rgbLabel.setText("195, 217, 56");
                rgbaLabel.setText(convertToRgba(195, 217, 56));

                nameLabel.setBackgroundResource(R.color.yellowGreen);
                hexLabel.setBackgroundResource(R.color.yellowGreen);
                rgbLabel.setBackgroundResource(R.color.yellowGreen);
                rgbaLabel.setBackgroundResource(R.color.yellowGreen);
                relativeLayout.setBackgroundResource(R.color.yellowGreen);

                hexPrompt.setBackgroundResource(R.color.yellowGreen);
                rgbPrompt.setBackgroundResource(R.color.yellowGreen);
                rgbaPrompt.setBackgroundResource(R.color.yellowGreen);

                nameLabel.setTextColor(Color.BLACK);
                hexLabel.setTextColor(Color.BLACK);
                rgbLabel.setTextColor(Color.BLACK);
                rgbaLabel.setTextColor(Color.BLACK);


                hexPrompt.setTextColor(Color.BLACK);
                rgbPrompt.setTextColor(Color.BLACK);
                rgbaPrompt.setTextColor(Color.BLACK);
                divider.setBackgroundResource(R.color.black);
                break;

            case "yellow":
                nameLabel.setText("Yellow");
                hexLabel.setText("#FFFF00");
                rgbLabel.setText("255, 255, 0");
                rgbaLabel.setText(convertToRgba(255, 255, 0));

                nameLabel.setBackgroundResource(R.color.yellow);
                hexLabel.setBackgroundResource(R.color.yellow);
                rgbLabel.setBackgroundResource(R.color.yellow);
                rgbaLabel.setBackgroundResource(R.color.yellow);
                relativeLayout.setBackgroundResource(R.color.yellow);

                hexPrompt.setBackgroundResource(R.color.yellow);
                rgbPrompt.setBackgroundResource(R.color.yellow);
                rgbaPrompt.setBackgroundResource(R.color.yellow);

                nameLabel.setTextColor(Color.BLACK);
                hexLabel.setTextColor(Color.BLACK);
                rgbLabel.setTextColor(Color.BLACK);
                rgbaLabel.setTextColor(Color.BLACK);

                hexPrompt.setTextColor(Color.BLACK);
                rgbPrompt.setTextColor(Color.BLACK);
                rgbaPrompt.setTextColor(Color.BLACK);
                divider.setBackgroundResource(R.color.black);
                break;

            case "orangeYellow":
                nameLabel.setText("Orange Yellow");
                hexLabel.setText("#FFAE42");
                rgbLabel.setText("255, 174, 66");
                rgbaLabel.setText(convertToRgba(255, 174, 66));

                nameLabel.setBackgroundResource(R.color.orangeYellow);
                hexLabel.setBackgroundResource(R.color.orangeYellow);
                rgbLabel.setBackgroundResource(R.color.orangeYellow);
                rgbaLabel.setBackgroundResource(R.color.orangeYellow);
                relativeLayout.setBackgroundResource(R.color.orangeYellow);

                hexPrompt.setBackgroundResource(R.color.orangeYellow);
                rgbPrompt.setBackgroundResource(R.color.orangeYellow);
                rgbaPrompt.setBackgroundResource(R.color.orangeYellow);

                nameLabel.setTextColor(Color.BLACK);
                hexLabel.setTextColor(Color.BLACK);
                rgbLabel.setTextColor(Color.BLACK);
                rgbaLabel.setTextColor(Color.BLACK);


                hexPrompt.setTextColor(Color.BLACK);
                rgbPrompt.setTextColor(Color.BLACK);
                rgbaPrompt.setTextColor(Color.BLACK);
                divider.setBackgroundResource(R.color.black);
                break;

            case "orange":
                nameLabel.setText("Orange");
                hexLabel.setText("#FF8B10");
                rgbLabel.setText("255, 139, 16");
                rgbaLabel.setText(convertToRgba(255, 139, 16));

                nameLabel.setBackgroundResource(R.color.orange);
                hexLabel.setBackgroundResource(R.color.orange);
                rgbLabel.setBackgroundResource(R.color.orange);
                rgbaLabel.setBackgroundResource(R.color.orange);
                relativeLayout.setBackgroundResource(R.color.orange);

                hexPrompt.setBackgroundResource(R.color.orange);
                rgbPrompt.setBackgroundResource(R.color.orange);
                rgbaPrompt.setBackgroundResource(R.color.orange);

                nameLabel.setTextColor(Color.BLACK);
                hexLabel.setTextColor(Color.BLACK);
                rgbLabel.setTextColor(Color.BLACK);
                rgbaLabel.setTextColor(Color.BLACK);


                hexPrompt.setTextColor(Color.BLACK);
                rgbPrompt.setTextColor(Color.BLACK);
                rgbaPrompt.setTextColor(Color.BLACK);
                divider.setBackgroundResource(R.color.black);
                break;

            case "redOrange":
                nameLabel.setText("Red Orange");
                hexLabel.setText("#FA5711");
                rgbLabel.setText("250, 87, 17");
                rgbaLabel.setText(convertToRgba(250, 87, 17));

                nameLabel.setBackgroundResource(R.color.redOrange);
                hexLabel.setBackgroundResource(R.color.redOrange);
                rgbLabel.setBackgroundResource(R.color.redOrange);
                rgbaLabel.setBackgroundResource(R.color.redOrange);
                relativeLayout.setBackgroundResource(R.color.redOrange);

                hexPrompt.setBackgroundResource(R.color.redOrange);
                rgbPrompt.setBackgroundResource(R.color.redOrange);
                rgbaPrompt.setBackgroundResource(R.color.redOrange);

                nameLabel.setTextColor(Color.WHITE);
                hexLabel.setTextColor(Color.WHITE);
                rgbLabel.setTextColor(Color.WHITE);
                rgbaLabel.setTextColor(Color.WHITE);

                hexPrompt.setTextColor(Color.WHITE);
                rgbPrompt.setTextColor(Color.WHITE);
                rgbaPrompt.setTextColor(Color.WHITE);
                divider.setBackgroundResource(R.color.white);
                break;

            case "red":
                nameLabel.setText("Red");
                hexLabel.setText("#FF0000");
                rgbLabel.setText("255, 0, 0");
                rgbaLabel.setText(convertToRgba(255, 0, 0));

                nameLabel.setBackgroundResource(R.color.red);
                hexLabel.setBackgroundResource(R.color.red);
                rgbLabel.setBackgroundResource(R.color.red);
                rgbaLabel.setBackgroundResource(R.color.red);
                relativeLayout.setBackgroundResource(R.color.red);

                hexPrompt.setBackgroundResource(R.color.red);
                rgbPrompt.setBackgroundResource(R.color.red);
                rgbaPrompt.setBackgroundResource(R.color.red);

                nameLabel.setTextColor(Color.WHITE);
                hexLabel.setTextColor(Color.WHITE);
                rgbLabel.setTextColor(Color.WHITE);
                rgbaLabel.setTextColor(Color.WHITE);

                hexPrompt.setTextColor(Color.WHITE);
                rgbPrompt.setTextColor(Color.WHITE);
                rgbaPrompt.setTextColor(Color.WHITE);
                divider.setBackgroundResource(R.color.white);
                break;

            case "violetRed":
                nameLabel.setText("Violet Red");
                hexLabel.setText("#8B0137");
                rgbLabel.setText("139, 1, 55");
                rgbaLabel.setText(convertToRgba(139, 1, 55));

                nameLabel.setBackgroundResource(R.color.violetRed);
                hexLabel.setBackgroundResource(R.color.violetRed);
                rgbLabel.setBackgroundResource(R.color.violetRed);
                rgbaLabel.setBackgroundResource(R.color.violetRed);
                relativeLayout.setBackgroundResource(R.color.violetRed);

                hexPrompt.setBackgroundResource(R.color.violetRed);
                rgbPrompt.setBackgroundResource(R.color.violetRed);
                rgbaPrompt.setBackgroundResource(R.color.violetRed);

                nameLabel.setTextColor(Color.WHITE);
                hexLabel.setTextColor(Color.WHITE);
                rgbLabel.setTextColor(Color.WHITE);
                rgbaLabel.setTextColor(Color.WHITE);

                hexPrompt.setTextColor(Color.WHITE);
                rgbPrompt.setTextColor(Color.WHITE);
                rgbaPrompt.setTextColor(Color.WHITE);
                divider.setBackgroundResource(R.color.white);
                break;

            case "violet":
                nameLabel.setText("Violet");
                hexLabel.setText("#9000FF");
                rgbLabel.setText("144, 0, 255");
                rgbaLabel.setText(convertToRgba(144, 0, 255));

                nameLabel.setBackgroundResource(R.color.violet);
                hexLabel.setBackgroundResource(R.color.violet);
                rgbLabel.setBackgroundResource(R.color.violet);
                rgbaLabel.setBackgroundResource(R.color.violet);
                relativeLayout.setBackgroundResource(R.color.violet);

                hexPrompt.setBackgroundResource(R.color.violet);
                rgbPrompt.setBackgroundResource(R.color.violet);
                rgbaPrompt.setBackgroundResource(R.color.violet);

                nameLabel.setTextColor(Color.WHITE);
                hexLabel.setTextColor(Color.WHITE);
                rgbLabel.setTextColor(Color.WHITE);
                rgbaLabel.setTextColor(Color.WHITE);

                hexPrompt.setTextColor(Color.WHITE);
                rgbPrompt.setTextColor(Color.WHITE);
                rgbaPrompt.setTextColor(Color.WHITE);
                divider.setBackgroundResource(R.color.white);
                break;

            case "blueViolet":
                nameLabel.setText("Blue Violet");
                hexLabel.setText("#54459E");
                rgbLabel.setText("84, 69, 158");
                rgbaLabel.setText(convertToRgba(84, 69, 158));

                nameLabel.setBackgroundResource(R.color.blueViolet);
                hexLabel.setBackgroundResource(R.color.blueViolet);
                rgbLabel.setBackgroundResource(R.color.blueViolet);
                rgbaLabel.setBackgroundResource(R.color.blueViolet);
                relativeLayout.setBackgroundResource(R.color.blueViolet);

                hexPrompt.setBackgroundResource(R.color.blueViolet);
                rgbPrompt.setBackgroundResource(R.color.blueViolet);
                rgbaPrompt.setBackgroundResource(R.color.blueViolet);

                nameLabel.setTextColor(Color.WHITE);
                hexLabel.setTextColor(Color.WHITE);
                rgbLabel.setTextColor(Color.WHITE);
                rgbaLabel.setTextColor(Color.WHITE);

                hexPrompt.setTextColor(Color.WHITE);
                rgbPrompt.setTextColor(Color.WHITE);
                rgbaPrompt.setTextColor(Color.WHITE);
                divider.setBackgroundResource(R.color.white);
                break;

            case "blue":
                nameLabel.setText("Blue");
                hexLabel.setText("#0000FF");
                rgbLabel.setText("0, 0, 255");
                rgbaLabel.setText(convertToRgba(0, 0, 255));

                nameLabel.setBackgroundResource(R.color.blue);
                hexLabel.setBackgroundResource(R.color.blue);
                rgbLabel.setBackgroundResource(R.color.blue);
                rgbaLabel.setBackgroundResource(R.color.blue);
                relativeLayout.setBackgroundResource(R.color.blue);

                hexPrompt.setBackgroundResource(R.color.blue);
                rgbPrompt.setBackgroundResource(R.color.blue);
                rgbaPrompt.setBackgroundResource(R.color.blue);

                nameLabel.setTextColor(Color.WHITE);
                hexLabel.setTextColor(Color.WHITE);
                rgbLabel.setTextColor(Color.WHITE);
                rgbaLabel.setTextColor(Color.WHITE);

                hexPrompt.setTextColor(Color.WHITE);
                rgbPrompt.setTextColor(Color.WHITE);
                rgbaPrompt.setTextColor(Color.WHITE);
                divider.setBackgroundResource(R.color.white);
                break;

            case "blueGreen":
                nameLabel.setText("Blue Green");
                hexLabel.setText("#02AB84");
                rgbLabel.setText("2, 171, 132");
                rgbaLabel.setText(convertToRgba(2, 171, 132));

                nameLabel.setBackgroundResource(R.color.blueGreen);
                hexLabel.setBackgroundResource(R.color.blueGreen);
                rgbLabel.setBackgroundResource(R.color.blueGreen);
                rgbaLabel.setBackgroundResource(R.color.blueGreen);
                relativeLayout.setBackgroundResource(R.color.blueGreen);

                hexPrompt.setBackgroundResource(R.color.blueGreen);
                rgbPrompt.setBackgroundResource(R.color.blueGreen);
                rgbaPrompt.setBackgroundResource(R.color.blueGreen);

                nameLabel.setTextColor(Color.WHITE);
                hexLabel.setTextColor(Color.WHITE);
                rgbLabel.setTextColor(Color.WHITE);
                rgbaLabel.setTextColor(Color.WHITE);

                hexPrompt.setTextColor(Color.WHITE);
                rgbPrompt.setTextColor(Color.WHITE);
                rgbaPrompt.setTextColor(Color.WHITE);
                divider.setBackgroundResource(R.color.white);
                break;

            case "black":
                nameLabel.setText("Black");
                hexLabel.setText("#000000");
                rgbLabel.setText("0, 0, 0");
                rgbaLabel.setText(convertToRgba(0, 0, 0));

                nameLabel.setBackgroundResource(R.color.black);
                hexLabel.setBackgroundResource(R.color.black);
                rgbLabel.setBackgroundResource(R.color.black);
                rgbaLabel.setBackgroundResource(R.color.black);
                relativeLayout.setBackgroundResource(R.color.black);

                hexPrompt.setBackgroundResource(R.color.black);
                rgbPrompt.setBackgroundResource(R.color.black);
                rgbaPrompt.setBackgroundResource(R.color.black);

                nameLabel.setTextColor(Color.WHITE);
                hexLabel.setTextColor(Color.WHITE);
                rgbLabel.setTextColor(Color.WHITE);
                rgbaLabel.setTextColor(Color.WHITE);

                hexPrompt.setTextColor(Color.WHITE);
                rgbPrompt.setTextColor(Color.WHITE);
                rgbaPrompt.setTextColor(Color.WHITE);
                divider.setBackgroundResource(R.color.white);
                break;

            case "grey":
                nameLabel.setText("Grey");
                hexLabel.setText("#9C9E9B");
                rgbLabel.setText("156, 158, 155");
                rgbaLabel.setText(convertToRgba(156, 158, 155));

                nameLabel.setBackgroundResource(R.color.grey);
                hexLabel.setBackgroundResource(R.color.grey);
                rgbLabel.setBackgroundResource(R.color.grey);
                rgbaLabel.setBackgroundResource(R.color.grey);
                relativeLayout.setBackgroundResource(R.color.grey);

                hexPrompt.setBackgroundResource(R.color.grey);
                rgbPrompt.setBackgroundResource(R.color.grey);
                rgbaPrompt.setBackgroundResource(R.color.grey);

                nameLabel.setTextColor(Color.WHITE);
                hexLabel.setTextColor(Color.WHITE);
                rgbLabel.setTextColor(Color.WHITE);
                rgbaLabel.setTextColor(Color.WHITE);

                hexPrompt.setTextColor(Color.WHITE);
                rgbPrompt.setTextColor(Color.WHITE);
                rgbaPrompt.setTextColor(Color.WHITE);
                divider.setBackgroundResource(R.color.white);
                break;

            case "white":
                nameLabel.setText("White");
                hexLabel.setText("#FFFFFF");
                rgbLabel.setText("255, 255, 255");
                rgbaLabel.setText(convertToRgba(255, 255, 255));

                nameLabel.setBackgroundResource(R.color.white);
                hexLabel.setBackgroundResource(R.color.white);
                rgbLabel.setBackgroundResource(R.color.white);
                rgbaLabel.setBackgroundResource(R.color.white);
                relativeLayout.setBackgroundResource(R.color.white);

                hexPrompt.setBackgroundResource(R.color.white);
                rgbPrompt.setBackgroundResource(R.color.white);
                rgbaPrompt.setBackgroundResource(R.color.white);

                nameLabel.setTextColor(Color.BLACK);
                hexLabel.setTextColor(Color.BLACK);
                rgbLabel.setTextColor(Color.BLACK);
                rgbaLabel.setTextColor(Color.BLACK);

                hexPrompt.setTextColor(getResources().getColor(R.color.dividerColor));
                rgbPrompt.setTextColor(getResources().getColor(R.color.dividerColor));
                rgbaPrompt.setTextColor(getResources().getColor(R.color.dividerColor));
                divider.setBackgroundResource(R.color.dividerColor);

                break;

        }

    }

    protected String convertToRgba(int redVal, int greenVal, int blueVal) {

        float[] floatResult = new float[4];

        floatResult[0] = redVal / 255f;
        floatResult[0] = Math.round(floatResult[0] * 100.0f) / 100.0f;

        floatResult[1] = greenVal / 255f;
        floatResult[1] = Math.round(floatResult[1] * 100.0f) / 100.0f;

        floatResult[2] = blueVal / 255f;
        floatResult[2] = Math.round(floatResult[2] * 100.0f) / 100.0f;

        floatResult[3] = 1.0f;

        String result = "(";

        for (int count = 0; count < floatResult.length; count++) {

            result += Float.toString(floatResult[count]) + ", ";

        }

        result = result.substring(0, (result.length() - 2));
        result += ")";

        return result;
    }

    protected void initialiseButtons() {

        greenButton.setBackgroundResource(R.color.green);
        yellowGreenButton.setBackgroundResource(R.color.yellowGreen);
        yellowButton.setBackgroundResource(R.color.yellow);

        orangeYellowButton.setBackgroundResource(R.color.orangeYellow);
        orangeButton.setBackgroundResource(R.color.orange);
        redOrangeButton.setBackgroundResource(R.color.redOrange);

        redButton.setBackgroundResource(R.color.red);
        violetRedButton.setBackgroundResource(R.color.violetRed);
        violetButton.setBackgroundResource(R.color.violet);

        blueVioletButton.setBackgroundResource(R.color.blueViolet);
        blueButton.setBackgroundResource(R.color.blue);
        blueGreenButton.setBackgroundResource(R.color.blueGreen);

        blackButton.setBackgroundResource(R.color.black);
        greyButton.setBackgroundResource(R.color.grey);
        whiteButton.setBackgroundResource(R.color.white);

        Log.i("TAG", "Successfully INIT Button");

    }

    protected void updateInitial() {
        nameLabel.setText("White");
        hexLabel.setText("#FFFFFF");
        rgbLabel.setText("255, 255, 255");
        rgbaLabel.setText("(1.0, 1.0, 1.0, 1.0)");
    }

}
