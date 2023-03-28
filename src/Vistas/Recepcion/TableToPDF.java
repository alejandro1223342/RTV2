package Vistas.Recepcion;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JTable;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class TableToPDF {

    public void exportarTabla(JTable tabla) throws DocumentException, FileNotFoundException {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showSaveDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            String rutaArchivo = archivo.getAbsolutePath();
            if (!rutaArchivo.endsWith(".pdf")) {
                rutaArchivo += ".pdf";
            }
            Document document = new Document(PageSize.A3);

            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo));

                // Agregar un encabezado personalizado con una imagen
                Image imagen = Image.getInstance("src/raven/cell/logo.png");
                imagen.setAlignment(Image.RIGHT);
                imagen.scaleToFit(100, 100);
                writer.setPageEvent(new PdfPageEventHelper() {
                    @Override
                    public void onEndPage(PdfWriter writer, Document document) {
                        Image imagenEncabezado;
                        try {
                            imagenEncabezado = Image.getInstance(imagen);
                            imagenEncabezado.setAlignment(Image.RIGHT);
                            imagenEncabezado.scaleToFit(100, 100);
                            imagenEncabezado.setBorder(Rectangle.NO_BORDER);
                            imagenEncabezado.setAbsolutePosition(document.right() - imagenEncabezado.getScaledWidth(),
                                    document.top() - imagenEncabezado.getScaledHeight());
                            document.add(imagenEncabezado);
                        } catch (DocumentException e) {
                            System.out.println("Error al crear documento" + e);
                        }
                    }
                });

                document.open();

                // Agregar el título y la fecha al documento
                Paragraph titulo = new Paragraph("Reporte Turnos RTV", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 20));
                titulo.setAlignment(Element.ALIGN_CENTER);
                document.add(titulo);
                Paragraph espacioEnBlanco = new Paragraph(" ");
                document.add(espacioEnBlanco);
                Paragraph fecha = new Paragraph(new SimpleDateFormat("dd/MM/yyyy").format(new Date()), FontFactory.getFont(FontFactory.HELVETICA, 12));
                fecha.setAlignment(Element.ALIGN_CENTER);
                document.add(fecha);
                Paragraph espacioEnBlanco1 = new Paragraph(" ");
                document.add(espacioEnBlanco1);
                
Paragraph tituloRep = new Paragraph("Reportes Turnos", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12));
                tituloRep.setAlignment(Element.ALIGN_LEFT);
                document.add(tituloRep);
                Paragraph espacioEnBlanco2 = new Paragraph(" ");
                document.add(espacioEnBlanco2);

                PdfPTable pdfTable = new PdfPTable(tabla.getColumnCount());
                // Agregar encabezados de columna
                for (int i = 0; i < tabla.getColumnCount(); i++) {
                    pdfTable.addCell(new PdfPCell(new Phrase(tabla.getColumnName(i), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16))));
                }
                // Agregar contenido de la tabla
                for (int rows = 0; rows < tabla.getRowCount(); rows++) {
                    for (int cols = 0; cols < tabla.getColumnCount(); cols++) {
                        PdfPCell cell = new PdfPCell(new Phrase(tabla.getValueAt(rows, cols).toString(),
                                FontFactory.getFont(FontFactory.HELVETICA, 16)));
                        //cell.setFixedHeight(60);
                        pdfTable.addCell(cell);
                        pdfTable.setWidthPercentage(100);
                    }
                }
                document.add(pdfTable);
                document.close();
            } catch (DocumentException ex) {
                System.out.println("Error al generar el documento PDF: " + ex.getMessage());
                ex.printStackTrace(System.out);
            } catch (FileNotFoundException ex) {
                System.out.println("No se pudo encontrar el archivo: " + ex.getMessage());
                ex.printStackTrace(System.out);
            } catch (IOException ex) {
                System.out.println("Error de entrada/salida al generar el documento PDF: " + ex.getMessage());
                ex.printStackTrace(System.out);
            } catch (Exception ex) {
                System.out.println("Otro tipo de excepción ocurrió: " + ex.getMessage());
                ex.printStackTrace(System.out);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Acción cancelada");
 }
}

}