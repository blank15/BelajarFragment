package id.kampung.belajarfragment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BaseResponse {

    boolean error;
    String message;
    List<ModelProvinsi> semuaprovinsi;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ModelProvinsi> getSemuaprovinsi() {
        return semuaprovinsi;
    }

    public void setSemuaprovinsi(List<ModelProvinsi> semuaprovinsi) {
        this.semuaprovinsi = semuaprovinsi;
    }
}
