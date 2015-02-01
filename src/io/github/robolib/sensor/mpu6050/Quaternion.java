

package io.github.robolib.sensor.mpu6050;

/**
 * 
 *
 * @author noriah Reuland <vix@noriah.dev>
 */
public class Quaternion {
    public double w;
    public double x;
    public double y;
    public double z;
    
    public Quaternion() {
        w = 1.0f;
        x = 0.0f;
        y = 0.0f;
        z = 0.0f;
    }
    
    public Quaternion(double nw, double nx, double ny, double nz) {
        w = nw;
        x = nx;
        y = ny;
        z = nz;
    }

    public Quaternion getProduct(Quaternion q) {
        // Quaternion multiplication is defined by:
        //     (Q1 * Q2).w = (w1w2 - x1x2 - y1y2 - z1z2)
        //     (Q1 * Q2).x = (w1x2 + x1w2 + y1z2 - z1y2)
        //     (Q1 * Q2).y = (w1y2 - x1z2 + y1w2 + z1x2)
        //     (Q1 * Q2).z = (w1z2 + x1y2 - y1x2 + z1w2
        return new Quaternion(
            w*q.w - x*q.x - y*q.y - z*q.z,  // new w
            w*q.x + x*q.w + y*q.z - z*q.y,  // new x
            w*q.y - x*q.z + y*q.w + z*q.x,  // new y
            w*q.z + x*q.y - y*q.x + z*q.w); // new z
    }

    public Quaternion getConjugate() {
        return new Quaternion(w, -x, -y, -z);
    }
    
    public double getMagnitude() {
        return Math.sqrt(w*w + x*x + y*y + z*z);
    }
    
    public void normalize() {
        double m = getMagnitude();
        w /= m;
        x /= m;
        y /= m;
        z /= m;
    }
    
    public Quaternion getNormalized() {
        Quaternion r = new Quaternion(w, x, y, z);
        r.normalize();
        return r;
    }
}