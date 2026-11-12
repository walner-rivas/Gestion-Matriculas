package conexion;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ConexionMongo {
    private static final String URI = "mongodb://localhost:27017";
    private static final String NOMBRE_BD = "matriculas_db";

    public static MongoDatabase conectar() {
        try {
            MongoClient cliente = MongoClients.create(URI);
            System.out.println("¡Conexión exitosa a MongoDB!");
            return cliente.getDatabase(NOMBRE_BD);
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        MongoDatabase db = conectar();
        if (db != null) {
            db.getCollection("prueba").insertOne(new Document("estado", "Sistema de matrículas conectado"));
            System.out.println("Dato guardado correctamente en MongoDB.");
        }
    }
}

