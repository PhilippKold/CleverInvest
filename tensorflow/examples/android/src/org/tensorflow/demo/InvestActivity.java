package org.tensorflow.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.formatter.SimpleAxisValueFormatter;
import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.ValueShape;
import lecho.lib.hellocharts.view.LineChartView;

public class InvestActivity extends AppCompatActivity {

    private LineChartView chart1;
    private LineChartView chart2;
    private int numberOfPointsMuster = 6;
    private int numberOfPoints = 6;

    float[] musterdepotValues = new float[120];
    float[] depotValues = new float[120];

    private ValueShape shape = ValueShape.CIRCLE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest);

        chart1 = (LineChartView) findViewById(R.id.chart1);
        chart2 = (LineChartView) findViewById(R.id.chart2);

        generateValues();

        generateDataChart1();
        generateDataChart2();

        // Disable viewport recalculations, see toggleCubic() method for more info.
        chart1.setViewportCalculationEnabled(false);
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
    }

    private void generateValues() {
        int i = 0;
        musterdepotValues[i] = (float) 1150;
        i++;
        musterdepotValues[i] = (float) 1160;
        i++;
        musterdepotValues[i] = (float) 1110;
        i++;
        musterdepotValues[i] = (float) 1170;
        i++;
        musterdepotValues[i] = (float) 1230;
        i++;
        musterdepotValues[i] = (float) 1220.22;
        i++;
        musterdepotValues[i] = (float) 1220.39;
        i++;
        musterdepotValues[i] = (float) 1230;
        i++;
        musterdepotValues[i] = (float) 1250;
        i++;
        musterdepotValues[i] = (float) 1270;
        i++;
        musterdepotValues[i] = (float) 1260.6;
        i++;
        musterdepotValues[i] = (float) 1300;
        i++;
        musterdepotValues[i] = (float) 1280;
        i++;
        musterdepotValues[i] = (float) 1290.1;
        i++;
        musterdepotValues[i] = (float) 1290.2;
        i++;
        musterdepotValues[i] = (float) 1290.3;
        i++;
        musterdepotValues[i] = (float) 1290.2;
        i++;
        musterdepotValues[i] = (float) 1300;
        i++;
        musterdepotValues[i] = (float) 1310;
        i++;
        musterdepotValues[i] = (float) 1290;
        i++;
        musterdepotValues[i] = (float) 1270;
        i++;
        musterdepotValues[i] = (float) 1260;
        i++;
        musterdepotValues[i] = (float) 1270;
        i++;
        musterdepotValues[i] = (float) 1270.9;
        i++;
        musterdepotValues[i] = (float) 1310;
        i++;
        musterdepotValues[i] = (float) 1330;
        i++;
        musterdepotValues[i] = (float) 1340;
        i++;
        musterdepotValues[i] = (float) 1350;
        i++;
        musterdepotValues[i] = (float) 1340;
        i++;
        musterdepotValues[i] = (float) 1380;
        i++;
        musterdepotValues[i] = (float) 1400;
        i++;
        musterdepotValues[i] = (float) 1390;
        i++;
        musterdepotValues[i] = (float) 1400;
        i++;
        musterdepotValues[i] = (float) 1410;
        i++;
        musterdepotValues[i] = (float) 1420;
        i++;
        musterdepotValues[i] = (float) 1430;
        i++;
        musterdepotValues[i] = (float) 1430;
        i++;
        musterdepotValues[i] = (float) 1430.2;
        i++;
        musterdepotValues[i] = (float) 1420.7;
        i++;
        musterdepotValues[i] = (float) 1430;
        i++;
        musterdepotValues[i] = (float) 1450;
        i++;
        musterdepotValues[i] = (float) 1470;
        i++;
        numberOfPointsMuster = i;


        int j = 0;
        depotValues[j] = (float) 800;
        j++;
        depotValues[j] = (float) 810;
        j++;
        depotValues[j] = (float) 820;
        j++;
        depotValues[j] = (float) 820;
        j++;
        depotValues[j] = (float) 810;
        j++;
        depotValues[j] = (float) 810.22;
        j++;
        depotValues[j] = (float) 840;
        j++;
        depotValues[j] = (float) 850;
        j++;
        depotValues[j] = (float) 880;
        j++;
        depotValues[j] = (float) 910;
        j++;
        depotValues[j] = (float) 950;
        j++;
        depotValues[j] = (float) 999;
        j++;
        depotValues[j] = (float) 970;
        j++;
        depotValues[j] = (float) 999;
        j++;
        depotValues[j] = (float) 990;
        j++;
        depotValues[j] = (float) 970;
        j++;
        depotValues[j] = (float) 950;
        j++;
        depotValues[j] = (float) 960;
        j++;
        depotValues[j] = (float) 920;
        j++;
        depotValues[j] = (float) 900;
        j++;
        depotValues[j] = (float) 880;
        j++;
        depotValues[j] = (float) 890;
        j++;
        depotValues[j] = (float) 900;
        j++;
        depotValues[j] = (float) 910;
        j++;
        depotValues[j] = (float) 910.2;
        j++;
        depotValues[j] = (float) 890.9;
        j++;
        depotValues[j] = (float) 890.3;
        j++;
        depotValues[j] = (float) 880;
        j++;
        depotValues[j] = (float) 890;
        j++;
        depotValues[j] = (float) 870;
        j++;
        depotValues[j] = (float) 930;
        j++;
        depotValues[j] = (float) 940;
        j++;
        depotValues[j] = (float) 950;
        j++;
        depotValues[j] = (float) 940;
        j++;
        depotValues[j] = (float) 950;
        j++;
        depotValues[j] = (float) 960;
        j++;
        depotValues[j] = (float) 950.5;
        j++;
        depotValues[j] = (float) 940.5;
        j++;
        depotValues[j] = (float) 930;
        j++;
        depotValues[j] = (float) 940;
        j++;
        depotValues[j] = (float) 920;
        j++;
        depotValues[j] = (float) 950.4;
        j++;
        numberOfPoints = j;


    }

    private void generateDataChart1() {

        List<Line> lines = new ArrayList<Line>();

        List<PointValue> values = new ArrayList<PointValue>();
        for (int j = 0; j < numberOfPointsMuster; ++j) {
            values.add(new PointValue(j, musterdepotValues[j]));
        }

        Line line = new Line(values);
        line.setColor(ContextCompat.getColor(getApplicationContext(), R.color.bright_yellow));
        line.setShape(shape);
        boolean isCubic = false;
        line.setCubic(isCubic);
        boolean isFilled = true;
        line.setFilled(isFilled);
        boolean hasLabels = false;
        line.setHasLabels(hasLabels);
        boolean hasLabelForSelected = false;
        line.setHasLabelsOnlyForSelected(hasLabelForSelected);
        boolean hasLines = true;
        line.setHasLines(hasLines);
        //line.setHasPoints(hasPoints);
        line.setHasPoints(false);
        lines.add(line);

        LineChartData data = new LineChartData(lines);

        boolean hasAxes = true;
        if (hasAxes) {
            Axis axisX = new Axis();

            axisX.setValues(null);
            axisX.setHasSeparationLine(true);
            axisX.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.dark));
            axisX.setHasLines(true);
            axisX.setLineColor(ContextCompat.getColor(getApplicationContext(), R.color.dark));
            axisX.setHasTiltedLabels(true);
            axisX.setTextSize(14);

            axisX.setFormatter(new SimpleAxisValueFormatter().setAppendedText(". Month".toCharArray()));//.setAppendedText("km".toCharArray()));

            Axis axisY = new Axis();
            axisY.setHasLines(true);
            axisY.setLineColor(ContextCompat.getColor(getApplicationContext(), R.color.dark));
            axisY.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.dark));
            axisY.setHasSeparationLine(true);
            //if (hasAxesNames) {
            if (false) {
                axisX.setName("");
                axisY.setName("");
            }
            data.setAxisXBottom(axisX);
            data.setAxisYLeft(axisY);
        } else {
            data.setAxisXBottom(null);
            data.setAxisYLeft(null);
        }

        data.setBaseValue(Float.NEGATIVE_INFINITY);
        chart1.setLineChartData(data);
    }


    private void generateDataChart2() {

        List<Line> lines = new ArrayList<Line>();

        List<PointValue> values = new ArrayList<PointValue>();
        for (int j = 0; j < numberOfPoints; ++j) {
            values.add(new PointValue(j, depotValues[j]));
        }

        Line line = new Line(values);
        line.setColor(ContextCompat.getColor(getApplicationContext(), R.color.bright_yellow));
        line.setShape(shape);
        boolean isCubic = false;
        line.setCubic(isCubic);
        boolean isFilled = true;
        line.setFilled(isFilled);
        boolean hasLabels = false;
        line.setHasLabels(hasLabels);
        boolean hasLabelForSelected = false;
        line.setHasLabelsOnlyForSelected(hasLabelForSelected);
        boolean hasLines = true;
        line.setHasLines(hasLines);
        //line.setHasPoints(hasPoints);
        line.setHasPoints(false);
        lines.add(line);

        LineChartData data = new LineChartData(lines);

        boolean hasAxes = true;
        if (hasAxes) {
            Axis axisX = new Axis();

            axisX.setValues(null);
            axisX.setHasSeparationLine(true);
            axisX.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.dark));
            axisX.setHasLines(true);
            axisX.setLineColor(ContextCompat.getColor(getApplicationContext(), R.color.dark));
            axisX.setHasTiltedLabels(true);
            axisX.setTextSize(14);

            axisX.setFormatter(new SimpleAxisValueFormatter().setAppendedText(". Month".toCharArray()));//.setAppendedText("km".toCharArray()));

            Axis axisY = new Axis();
            axisY.setHasLines(true);
            axisY.setLineColor(ContextCompat.getColor(getApplicationContext(), R.color.dark));
            axisY.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.dark));
            axisY.setHasSeparationLine(true);
            //if (hasAxesNames) {
            if (false) {
                axisX.setName("");
                axisY.setName("");
            }
            data.setAxisXBottom(axisX);
            data.setAxisYLeft(axisY);
        } else {
            data.setAxisXBottom(null);
            data.setAxisYLeft(null);
        }

        data.setBaseValue(Float.NEGATIVE_INFINITY);
        chart2.setLineChartData(data);
    }

}
