/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias;

import java.util.Date;

/**
 *
 * @author JAVA-ADV
 */
public class AsistenciaImpl implements Asistencia {

    @Override
    public ClassEvent findClassEvent(Date date, String teacherCode) {
//        //validar si el codigo de profesor pertenece a un
//        //profesor... buscar el profesor
//
//        Teacher teacher = teacherDao.find(teacherCode);
//        
//        if (teacher == null) {
//            //o emitir una excapcion
//            return null;
//        }
//        
//        //TODO terminar
//        Event event = eventDao.findForTeacherAndDate(teacher, date);
//        
//        
//        
//        EventPupilList epl = eplDao.find(event);
//
//        //marcar asistencia para el profesor
//        Date checkInDate = checkInDao.check(teacher);
//        
//        ClassEvent classEvent = new ClassEvent();
//        classEvent.setBegin(event.getBegin());
//        classEvent.setEnd(event.getEnd());
//        //TODO terminar el traspaso de datos
//        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ClassEvent save(ClassEvent classEvent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
