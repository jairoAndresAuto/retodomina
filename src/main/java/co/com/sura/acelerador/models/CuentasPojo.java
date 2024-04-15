package co.com.sura.acelerador.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CuentasPojo {
    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("customerId")
    @Expose
    private Integer customerId;

    @SerializedName("balance")
    @Expose
    private Integer balance;

    @SerializedName("type")
    @Expose
    private Integer type;
}
