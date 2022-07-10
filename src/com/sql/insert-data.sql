/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  alfreding0
 * Created: Jul 9, 2022
 */

INSERT INTO `secretaria` (`id`, `nombre_completo`, `celular`, `direccion`) VALUES
(3, 'Jimena Torrez', '7878', 'Camiri City sxd'),
(5, 'Maria Ferreira', '78346999', 'popopopopo'),
(6, 'Federico Gutierrez', '92443879', 'Mexico xdxd');


INSERT INTO `medico` (`id`, `codigo_interno`, `nombres`, `apellidos`, `ci`, `celular`, `direccion`) VALUES
(2, '0101MED', 'Fernando', 'Villegas', '89068342', '70347467', 'Calle Velazques #3'),
(3, '3093MED', 'Esteban', 'Cuellar', '5232345', '763842293', 'Calle Rivadavia #52'),
(4, '7832MED', 'Jonathan', 'Volcanes', '8234', '70347467', 'Avenida El Crucero');



INSERT INTO `cirugia` (`id`, `fecha`, `hora`, `nro_sala`, `secretaria_id`) VALUES
(30, '2022-07-23', '11:30:00', 3, 3),
(32, '2022-07-08', '10:30:00', 5, 5),
(33, '2022-07-08', '22:30:00', 9, 5),
(34, '2022-07-16', '02:30:00', 2, 3),
(35, '2022-07-16', '14:30:00', 7, 3),
(36, '2022-07-21', '20:00:00', 1, 3),
(37, '2022-07-21', '08:00:00', 3, 3),
(38, '2022-05-12', '23:30:00', 4, 3);



INSERT INTO `cirugia_medico` (`id`, `cirugia_id`, `medico_id`) VALUES
(59, 38, 2),
(60, 38, 3),
(61, 38, 4),
(62, 38, 2),
(64, 33, 3),
(66, 33, 2),
(67, 30, 2),
(68, 30, 3),
(69, 32, 4);

