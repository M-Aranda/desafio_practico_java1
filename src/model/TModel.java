
package model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TModel implements TableModel{
    
    private List<CriminalEnBD> listaCriminalesRegistrados;

    public TModel(List<CriminalEnBD> listaCriminalesRegistrados) {
        this.listaCriminalesRegistrados = listaCriminalesRegistrados;
    }

     @Override
    public int getRowCount() {
        return listaCriminalesRegistrados.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "Nombre";
            case 2:
                return "Apellidos";
            case 3:
                return "Sexo";
            case 4:
                return "Nacionalidad";
            case 5:
                return "Rut Chileno";
            case 6:
                return "Estado";
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return String.class;
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CriminalEnBD cebd = listaCriminalesRegistrados.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return cebd.getID();
            case 1:
                return cebd.getNombres();
            case 2:
                return cebd.getApellidos();
            case 3:
                return cebd.getSexo();
            case 4:
                return cebd.getNacionalidad();
            case 5:
                return cebd.getRut();
            case 6:
                return cebd.getEstado();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // modificar la lista BD
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //
    }
    
    
    
}
