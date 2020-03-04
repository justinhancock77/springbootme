insert into organization(id, active, org_name, description) 
	values ('edda3591-c9a0-4882-8beb-2950ce9bf25b', true, 'justin inc', 'justin inc description');

insert into role(id, active, role_name, description) 
	values (uuid_generate_v4(), true, 'ADMIN', 'Admin Role');

insert into users(id, organization_id, active, email, first_name, last_name) 
	values (uuid_generate_v4(), 'edda3591-c9a0-4882-8beb-2950ce9bf25b', true, 'jjhancock@gmail.com', 'Justin', 'Hancock');

