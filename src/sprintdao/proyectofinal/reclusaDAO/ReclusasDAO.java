package sprintdao.proyectofinal.reclusaDAO;

import sprintdao.proyectofinal.modelo.Reclusa;

import java.sql.SQLException;
import java.util.List;

public interface ReclusasDAO {
    public int create(Reclusa reclusa) throws SQLException;
    public void delete(int reclusasId) throws SQLException;
    public Reclusa read(int reclusasId) throws SQLException;
    public void update(Reclusa reclusa) throws SQLException;
    public List<Reclusa> getReclusas() throws SQLException;
}
