insert into organization(id, active, org_name, description) 
	values ('edda3591-c9a0-4882-8beb-2950ce9bf25b', true, 'Payback', 'The highest organization in the heirarchy');

insert into role(id, active, role_name, description) 
	values (uuid_generate_v4(), true, 'ROLE_ADMIN', 'Admin Role');
	
insert into role(id, active, role_name, description) 
	values (uuid_generate_v4(), true, 'ROLE_USER', 'User (Consumer) Role');
	
	

--insert into users(id, organization_id, active, email, first_name, last_name, email_verified, name, password, provider, provider_id) 
--	values (uuid_generate_v4(), 'edda3591-c9a0-4882-8beb-2950ce9bf25b', true, 'justin@payback.com', 'Justin', 'Hancock', false, 'Justin Hancock', 'test123', 'facebook');

