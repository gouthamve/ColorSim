package api.payloads;

import javax.validation.constraints.Size;

/**
 * Created by goutham on 03/05/16.
 */
public class SimilarityPayload {
    @Size(max=3, min=3)
    public double rgb1[];
    @Size(max=3, min=3)
    public double rgb2[];


    public double[] getRgb1() {
        return rgb1;
    }
    public void setRgb1(double[] rgb1) {
        this.rgb1 = rgb1;
    }

    public double[] getRgb2() {
        return rgb2;
    }
    public void setRgb2(double[] rgb2) {
        this.rgb2 = rgb2;
    }


    public SimilarityPayload(){};
}