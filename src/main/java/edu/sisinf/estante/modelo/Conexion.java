package edu.sisinf.estante.modelo;

public class Conexion {
    private String id;            // identificador único, ej. UUID
    private String nombre;        // nombre legible para el usuario
    private TipoMotor tipoMotor;  // SQLITE o MYSQL
    private String host;          // null para SQLite
    private Integer puerto;       // null para SQLite
    private String basedatos;     // ruta del archivo para SQLite, nombre de BD para MySQL
    private String usuario;       // null o vacío para SQLite
    private String password;      // null o vacío para SQLite

    // Constructor sin argumentos requerido por Jackson
    public Conexion() {}

    // Constructor con todos los campos
    public Conexion(String id, String nombre, TipoMotor tipoMotor,
                    String host, Integer puerto, String basedatos,
                    String usuario, String password) {
        this.id = id;
        this.nombre = nombre;
        this.tipoMotor = tipoMotor;
        this.host = host;
        this.puerto = puerto;
        this.basedatos = basedatos;
        this.usuario = usuario;
        this.password = password;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public TipoMotor getTipoMotor() { return tipoMotor; }
    public void setTipoMotor(TipoMotor tipoMotor) { this.tipoMotor = tipoMotor; }

    public String getHost() { return host; }
    public void setHost(String host) { this.host = host; }

    public Integer getPuerto() { return puerto; }
    public void setPuerto(Integer puerto) { this.puerto = puerto; }

    public String getBasedatos() { return basedatos; }
    public void setBasedatos(String basedatos) { this.basedatos = basedatos; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    // toString() sin password
    @Override
    public String toString() {
        return "Conexion{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipoMotor=" + tipoMotor +
                ", host='" + host + '\'' +
                ", puerto=" + puerto +
                ", basedatos='" + basedatos + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
